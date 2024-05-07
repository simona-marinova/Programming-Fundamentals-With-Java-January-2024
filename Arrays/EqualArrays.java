package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersOne = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbersTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumOne = 0;
        int sumTwo = 0;
        boolean isDifferent = false;
        for (int i = 0; i <= numbersOne.length - 1; i++) {
            sumOne = sumOne + numbersOne[i];
        }

        for (int j = 0; j <= numbersTwo.length - 1; j++) {
            if (numbersOne[j] != numbersTwo[j]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", j);
                break;
            }
            sumTwo = sumTwo + numbersTwo[j];
        }
        if (sumOne == sumTwo) {
            System.out.printf("Arrays are identical. Sum: %d", sumOne);

        }
    }
}