package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
       char[] symbols = input.toCharArray();
StringBuilder letters = new StringBuilder();
StringBuilder digits = new StringBuilder();
StringBuilder others = new StringBuilder();

        for (int i = 0; i <= symbols.length-1; i++) {
            char currentSymbol = symbols[i];
            if(Character.isLetter(currentSymbol)) {
                letters.append(currentSymbol);
            }
            else if(Character.isDigit(currentSymbol)) {
                digits.append(currentSymbol);
            }
            else {
                others.append(currentSymbol);
            }

        }

        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(others.toString());




    }
}
