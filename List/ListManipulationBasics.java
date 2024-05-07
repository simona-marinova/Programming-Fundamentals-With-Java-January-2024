package List;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();


        while (!command.equals("end")) {
            String[] commands = command.split(" ");
            switch (commands[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(commands[1]));
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(Integer.parseInt(commands[1])));
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(commands[1]));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(commands[2]), Integer.parseInt(commands[1]));
                    break;

            }

            command = scanner.nextLine();

        }

        for (int number:numbers) {
            System.out.print(number+ " ");
        }
    }
}
