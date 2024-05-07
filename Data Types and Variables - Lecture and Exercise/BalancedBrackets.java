package PFDataTypesAndVariables;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isOpen = false;
        int countOpen = 0;
        boolean isClosed = false;
        int countClosed = 0;
        String parentheses = "";

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            char symbol = input.charAt(0);
            if ((int) symbol == 40 || (int) symbol == 41) {
                parentheses = parentheses + symbol;
            }
            if ((int) symbol == 40 && input.length() == 1) {
                countOpen++;
                isOpen = true;
            }
            if ((int) symbol == 41 && input.length() == 1) {
                countClosed++;
                isClosed = true;
            }

            if (isClosed && !isOpen) {
                System.out.println("UNBALANCED");
                return;
            }
        }

        if (parentheses.contains("((") || parentheses.contains("))")) {
            System.out.println("UNBALANCED");
        } else if ((parentheses.startsWith("()")) && countOpen == countClosed) {
            System.out.println("BALANCED");
        }
        else  {
            System.out.println("UNBALANCED");
        }
    }
}



