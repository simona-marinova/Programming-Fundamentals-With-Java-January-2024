package RegularExamFundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            String[] commands = command.split(" ");
            String instruction = commands[0];
            switch (instruction) {
                case "TakeOdd":
                    StringBuilder newWord = new StringBuilder();
                    for (int i = 1; i < text.length(); i += 2) {
                        char currentSymbol = text.charAt(i);
                        newWord.append(currentSymbol);
                    }
                    text = newWord;
                    System.out.println(text);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commands[1]);
                    int length = Integer.parseInt(commands[2]);
                    text.delete(index, index + length);
                    System.out.println(text);
                    break;
                case "Substitute":
                    String substring = commands[1];
                    String replacement = commands[2];
                    if (text.toString().contains(substring)) {
                        String temporary = text.toString();
                        temporary = temporary.replace(substring, replacement);
                        text = new StringBuilder(temporary);
                        System.out.println(text);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", text);
    }
}
