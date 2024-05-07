package PFDataTypesAndVariables;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            boolean isSpace = false;
            int sumLeft = 0;
            int sumRight = 0;
            String numberTwo = "";
            String numberOne = "";
            String input = scanner.nextLine();
            int length = input.length();
            for (int position = 0; position < length; position++) {
                char symbol = input.charAt(position);
                if ((int) symbol == 32) {
                    isSpace = true;
                    continue;
                }
                if (isSpace) {
                    numberTwo = numberTwo + symbol + "";

                } else {
                    numberOne = numberOne + symbol + "";

                }

            }
            long numOne = Long.parseLong(numberOne);
            long numTwo = Long.parseLong(numberTwo);
            long one = Math.abs(numOne);
            long two = Math.abs(numTwo);

            while (one > 0) {
                int currentDigit = (int) (one % 10);
                sumLeft = sumLeft + currentDigit;
                one = one / 10;
            }
            while (two > 0) {
                int currentDig = (int) (two % 10);
                sumRight = (int) (sumRight + currentDig);
                two = two / 10;
            }

            if (numOne > numTwo) {
                System.out.println(sumLeft);
            } else {
                System.out.println(sumRight);
            }
        }

    }
}