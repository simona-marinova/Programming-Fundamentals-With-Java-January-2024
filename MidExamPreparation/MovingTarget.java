package FundamentalsMidExamPreparation;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commands = command.split(" ");
            int index = Integer.parseInt(commands[1]);
            switch (commands[0]) {
                case "Shoot":
                    int power = Integer.parseInt(commands[2]);
                    boolean isValid = isValidRange(index, targets);
                    if (isValid) {
                        int valueToReduce = targets.get(index);
                        targets.set(index, valueToReduce - power);
                        if (targets.get(index) <= 0) {
                            targets.remove(index);
                        }
                    } else {
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(commands[2]);
                  isValid = isValidRange(index, targets);
                    if (isValid) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(commands[2]);
                    int start = index - radius;
                    int end = index + radius;
                    if (start >= 0 && start <= targets.size() - 1 && end >= 0 && end <= targets.size() - 1) {
                        for (int i = end; i >= start; i--) {
                            targets.remove(i);
                        }
                    } else {
                        System.out.println("Strike missed!");
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i <= targets.size() - 1; i++) {
            if (i < targets.size() - 1) {
                System.out.print(targets.get(i) + "|");
            } else {
                System.out.print(targets.get(i));
            }
        }

    }

    public static boolean isValidRange(int index, List<Integer> targets) {
        boolean isValid = false;
        if (index >= 0 && index <= targets.size() - 1) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }
}