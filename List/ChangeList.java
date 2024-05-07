package List;

import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while(!input.equals("end")) {
            if(input.contains("Delete")) {
                String [] commands = input.split(" ");
                int number = Integer.parseInt(commands[1]);
                list.removeAll(List.of(number));
            }
            else {
                String [] commands = input.split(" ");
                int element = Integer.parseInt(commands[1]);
                int position = Integer.parseInt(commands[2]);
                list.add(position, element);
            }


            input=scanner.nextLine();
        }

        for (int number:list) {
            System.out.print(number+ " ");
        }
    }
}
