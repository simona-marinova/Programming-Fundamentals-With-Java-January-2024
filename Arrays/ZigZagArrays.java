package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbersOne = new int[n];
        int[] numbersTwo = new int[n];


        for (int i = 1; i <= n; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 != 0) {
                numbersOne[i-1] = numbers[0];
                numbersTwo[i-1] = numbers[1];

            } else {
                numbersOne[i-1] = numbers[1];
                numbersTwo[i-1] = numbers[0];

            }
        }

        for (int i : numbersOne) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : numbersTwo) {
            System.out.print(i + " ");
        }
    }

}