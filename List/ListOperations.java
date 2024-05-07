package List;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String operation = scanner.nextLine();
        while (!operation.equals("End")) {
            String[] commands = operation.split(" ");
            switch (commands[0]) {
                case "Add":
                    int number = Integer.parseInt(commands[1]);
                    list.add(number);
                    break;
                case "Insert":
                    number = Integer.parseInt(commands[1]);
                    int index = Integer.parseInt(commands[2]);
                    if (index < 0 || index > list.size() - 1) {
                        System.out.println("Invalid index");
                    } else {
                        list.add(index, number);
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(commands[1]);
                    if (index < 0 || index > list.size() - 1) {
                        System.out.println("Invalid index");
                    } else {
                        list.remove(index);
                    }
                    break;
                case "Shift":
                    if (commands[1].equals("left")) {
                        int count = Integer.parseInt(commands[2]);
                        for (int i = 1; i <= count; i++) {
                            int firstNumber = list.get(0);
                       list.add(firstNumber);
                       list.remove(0);
                        }
                    } else {
                        int count = Integer.parseInt(commands[2]);
                        for (int i = 1; i <= count; i++) {
                            int lastNumber = list.get(list.size() - 1);
                            list.add(0, lastNumber);
                            list.remove(list.size()-1);
                        }
                    }
                    break;
            }

            operation = scanner.nextLine();
        }
        for (int number:list) {
            System.out.print(number+ " ");
        }
    }
}
