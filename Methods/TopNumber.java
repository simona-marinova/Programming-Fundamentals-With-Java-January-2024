package Methods;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printTopNumbers(number);
    }
    public static void printTopNumbers(int number) {
        for (int currentNumber = 1; currentNumber <= number; currentNumber++) {
            int sumDigits = 0;
            boolean oneOddDigit = false;
            String currentNum = currentNumber + "";
            for (int i = 0; i <= currentNum.length() - 1; i++) {
                char symbol = currentNum.charAt(i);
                int currentDigit = Integer.parseInt(symbol + "");
                if (currentDigit % 2 != 0) {
                    oneOddDigit = true;
                }
                sumDigits += currentDigit;
            }
            if (sumDigits % 8 == 0 && oneOddDigit) {
                System.out.println(currentNumber);
            }
        }
    }
}
