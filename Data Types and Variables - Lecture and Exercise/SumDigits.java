package PFDataTypesAndVariables;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum=0;
        String text = number + "";

        for (int i = 0; i <=text.length()-1; i++) {
            char symbol = text.charAt(i);
            int digit =Integer.parseInt(symbol+"");
            sum+=digit;

        }
        System.out.println(sum);
    }
}
