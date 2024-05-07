package FundamentalsMidExamPreparation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialLoot = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commands = command.split(" ");
            switch (commands[0]) {
                case "Loot":
                    List<String> newLoot = Arrays.stream(command.split(" ")).collect(Collectors.toList());
                    newLoot.remove(0);
                    for (int i = 0; i <=newLoot.size() - 1 ; i++) {
                        boolean isEqual=false;
                        for (int j = 0; j <= initialLoot.size() - 1; j++) {
                            if (newLoot.get(i).equals(initialLoot.get(j))) {
                            isEqual=true;
                            }
                            else {
                                isEqual=false;
                            }
                        }
                        if(!isEqual) {
                         //   initialLoot.add(0, newLoot.get(j));
                        }
                    }
                  //  if (!newLoot.isEmpty()) {
                     //   for (int j = 0; j <= newLoot.size() - 1; j++) {
                        //    initialLoot.add(0, newLoot.get(j));
                    //    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commands[1]);
                    if (index < 0 || index > initialLoot.size() - 1) {
                        command = scanner.nextLine();
                        continue;
                    } else {
                        String loot = initialLoot.get(index);
                        initialLoot.remove(index);
                        initialLoot.add(loot);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commands[1]);
                    if (count > initialLoot.size()) {
                        count = initialLoot.size();
                    }
                    int startPosition = (initialLoot.size() - count);
                    if (startPosition < 0) {
                        startPosition = 0;
                    }
                    List<String> stolenItems = new ArrayList<>();
                    for (int i = startPosition; i <= initialLoot.size() - 1; i++) {
                        stolenItems.add(initialLoot.get(i));
                    }
                    for (int i = initialLoot.size() - 1; i >= startPosition; i--) {
                        initialLoot.remove(i);
                    }
                    for (int i = 0; i <= stolenItems.size() - 1; i++) {
                        if (i < stolenItems.size() - 1) {
                            System.out.print(stolenItems.get(i) + ", ");
                        } else {
                            System.out.print(stolenItems.get(i));
                        }
                    }
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }

        int sumLength = 0;

        for (int i = 0; i <= initialLoot.size() - 1; i++) {
            String text = initialLoot.get(i);
            int length = text.length();
            sumLength += length;
        }

        double averageTreasure = sumLength * 1.0 / initialLoot.size();
        if (!initialLoot.isEmpty()) {
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", averageTreasure);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}