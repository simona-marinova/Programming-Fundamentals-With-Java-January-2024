package Methods;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        matrixFromNumber(number);

    }

    public static void matrixFromNumber (int number) {
        for (int rows = 1; rows <=number ; rows++) {
            for (int col = 1; col <=number; col++) {
                System.out.print(number+ " ");
            }
            System.out.println();
        }
    }
}
