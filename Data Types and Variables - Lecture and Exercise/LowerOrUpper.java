package PFDataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);
        int number = (int) symbol;


        if (number >= 97 && number <= 122) {
            System.out.println("lower-case");
        } else if (number >= 65 && number <= 90) {
            System.out.println("upper-case");
        }
    }
}