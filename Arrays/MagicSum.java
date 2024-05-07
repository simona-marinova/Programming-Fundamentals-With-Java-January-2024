package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                int number = numbers[j];
                sum = currentNumber + number;
                if (sum == n) {
                    System.out.print(currentNumber + " ");
                    System.out.println(number+ " ");
                }
            }

        }

    }
}
