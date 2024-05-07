package PFBasicOverviewExercise;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] numbers = new double[3];
        numbers[0] = Double.parseDouble(scanner.nextLine());
        numbers[1] = Double.parseDouble(scanner.nextLine());
        numbers[2] =Double.parseDouble(scanner.nextLine());


       double min = Double.MAX_VALUE;
      double max = Double.MIN_VALUE;
       double average = 0;

        for (double currentNumber : numbers) {
            if (currentNumber < min) {
                min = currentNumber;
            }
            if (currentNumber > max) {
                max = currentNumber;
            }

        }

        for (int i = 0; i <= 2; i++) {
            if (numbers[i] != min && numbers[i] != max) {
                average = numbers[i];
            }

        }

        System.out.printf("%.0f%n", max);
        System.out.printf("%.0f%n", average);
        System.out.printf("%.0f%n", min);

    }
}

