package PFBasicOverviewExercise;

import java.util.Scanner;

public class TriangleOFNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;

        for (int row = 1; row <=n ; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(number+ " ");
            }
            System.out.println();
            number++;
        }
    }
}
