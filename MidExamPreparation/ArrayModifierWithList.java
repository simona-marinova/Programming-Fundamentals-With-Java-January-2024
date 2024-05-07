package FundamentalsMidExamPreparation;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;

public class ArrayModifierWithList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commands = input.split(" ");
            switch (commands[0]) {
                case "swap":
                    int indexOne = Integer.parseInt(commands[1]);
                    int indexTwo = Integer.parseInt(commands[2]);
                    int elementOne = numbers.get(indexOne);
                    int elementTwo = numbers.get(indexTwo);
                    numbers.set(indexOne, elementTwo);
                    numbers.set(indexTwo, elementOne);
                    break;
                case "multiply":
                    indexOne = Integer.parseInt(commands[1]);
                    indexTwo = Integer.parseInt(commands[2]);
                    elementOne = numbers.get(indexOne);
                    elementTwo = numbers.get(indexTwo);
                    int result = elementOne * elementTwo;
                    numbers.set(indexOne, result);
                    break;
                case "decrease":
                    for (int i = 0; i <= numbers.size() - 1; i++) {
                        int currentNumber = numbers.get(i);
                        numbers.set(i, currentNumber - 1);
                    }
                    break;
            }

            input = scanner.nextLine();
        }


        for (int number : numbers) {
           // if (number != numbers.get(numbers.size() - 1)) {
                System.out.print(number + ", ");
           // } //else {
                //System.out.print(number);
          //  }
        }

        //System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));

     /*   for (int i = 0; i <=numbers.size()-1 ; i++) {
            if(i!=numbers.size()-1) {
                System.out.print(numbers.get(i)+ ", ");
            }
            else {
                System.out.print(numbers.get(i));
            }
       */
    }
}
