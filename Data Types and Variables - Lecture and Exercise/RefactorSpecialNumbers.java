package PFDataTypesAndVariables;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= count; i++) {
           int number = i;
            int sum = 0;
            boolean isSpecialNum = false;
            while (i > 0) {
               sum=sum+i%10;
                i = i / 10;
            }
            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", number, isSpecialNum);
            sum = 0;
            i=number;
        }
    }
}
