package List;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commands = command.split(" ");
            String singleCommand = commands[0];
            switch (singleCommand) {
                case "Contains":
                    int number = Integer.parseInt(commands[1]);
                    if (list.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commands[1].equals("even")) {
                        for (int currentNumber : list) {
                            if (currentNumber % 2 == 0) {
                                System.out.print(currentNumber + " ");
                            }
                        }
                        System.out.println();
                    } else if (commands[1].equals("odd")) {
                        for (int currentNumber : list) {
                            if (currentNumber % 2 != 0) {
                                System.out.print(currentNumber + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int currentNumber : list) {
                        sum += currentNumber;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String sign = commands[1];
                    number = Integer.parseInt(commands[2]);
                    if (sign.equals("<")) {
                        for (int currentNum : list) {
                            if (currentNum < number) {
                                System.out.print(currentNum + " ");
                            }
                        }
                        System.out.println();
                    }
                    else if (sign.equals(">")) {
                        for (int currentNum : list) {
                            if (currentNum > number) {
                                System.out.print(currentNum + " ");
                            }
                        }
                        System.out.println();
                    } else if (sign.equals(">=")) {
                        for (int currentNum : list) {
                            if (currentNum >= number) {
                                System.out.print(currentNum + " ");
                            }
                        }
                        System.out.println();
                    } else if (sign.equals("<=")) {
                        for (int currentNum : list) {
                            if (currentNum <= number) {
                                System.out.print(currentNum + " ");
                            }
                        }
                        System.out.println();
                    }

                    break;

            }
            command = scanner.nextLine();
        }
    }
}