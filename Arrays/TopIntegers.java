package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isBigger = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            for (int j = i+1; j <= numbers.length-1; j++) {
                int number = numbers[j];
                if (currentNumber > number) {
                    isBigger = true;
                } else {
                    isBigger=false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(currentNumber + " ");
            }

        }
        System.out.print(numbers[numbers.length-1]);
    }
}