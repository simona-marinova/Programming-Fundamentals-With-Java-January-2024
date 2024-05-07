package Methods;

import java.util.Scanner;

public class PrintingTriangle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <n ; rows++) {
            for (int col = 1; col <=rows ; col++) {
                int currentNumber=col;
                System.out.print(currentNumber + " ");
            }
            System.out.println();
        }
        for (int rows =n; rows >=1 ; rows--) {
            for (int col = 1; col <=rows ; col++) {
                int currentNumber=col;
                System.out.print(currentNumber+ " ");
            }
            System.out.println();
        }
    }
}