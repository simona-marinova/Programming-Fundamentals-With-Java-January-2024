package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int currentNumber : numbers) {
            if (currentNumber % 2 == 0) {
                sum += currentNumber;
            }


        }

        System.out.println(sum);
    }

}

