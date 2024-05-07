package PFDataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String text = "" + i;
            int sum = 0;
            for (int position = 0; position <= text.length()-1; position++) {
                char symbol = text.charAt(position);
                int digit = Integer.parseInt(symbol+"");
                sum = sum + digit;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}