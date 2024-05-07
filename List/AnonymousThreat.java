package List;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> texts = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] commands = command.split(" ");
            switch (commands[0]) {
                case "merge":
                    int startIndex = Integer.parseInt(commands[1]);
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    boolean startIsValid = false;
                    if (startIndex >= 0 && startIndex <= texts.size() - 1) {
                        startIsValid = true;
                    }
                    int endIndex = Integer.parseInt(commands[2]);
                    if (endIndex > texts.size() - 1) {
                        endIndex = texts.size() - 1;
                    }
                    boolean endIsValid = false;
                    if (endIndex >= 0 && endIndex <= texts.size() - 1) {
                        endIsValid = true;
                    }
                    if (startIsValid && endIsValid) {
                        String concatenated = "";
                        for (int i = startIndex; i <= endIndex; i++) {
                            concatenated = concatenated + texts.get(i);
                        }
                        for (int i = endIndex; i >= startIndex; i--) {
                            texts.remove(i);
                        }
                        texts.add(startIndex, concatenated);
                    }

                    break;
                case "divide":
                    int index = Integer.parseInt(commands[1]);
                    int partitions = Integer.parseInt(commands[2]);
                    String text = texts.get(index);
                    int countChars = text.length() / partitions;
                    String newText = "";
                    List<String> newList = new ArrayList<>();
                    int count = 0;
                    for (int i = 0; i <= text.length() - 1; i++) {
                        count++;
                        char currentSymbol = text.charAt(i);
                        newText = newText + currentSymbol;
                        if (count % countChars == 0) {
                            newList.add(newText);
                            newText = "";
                        }
                    }
                        if(newList.size()>partitions) {
                            String concatenated = "";
                            for (int k = newList.size()-2; k <= newList.size()-1; k++) {
                                concatenated = concatenated + newList.get(k);
                            }
                            newList.remove(newList.size()-1);
                            newList.remove(newList.size()-1);
                            newList.add(concatenated);
                        }
                    texts.remove(index);
                    int j=index;
                    for (int i = 0; i <=partitions-1 ; i++) {
                        texts.add(j, newList.get(i));
                        j++;
                    }
                    break;
            }
                command = scanner.nextLine();
            }
        for (String text:texts) {
            System.out.print(text+ " ");
        }
        }
    }
