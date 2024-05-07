package TextProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder newText = new StringBuilder(text);
        int strength = 0;

        for (int i = 0; i <= newText.length() - 1; i++) {
            char currentSymbol = newText.charAt(i);
            if (currentSymbol == '>') {
                int number = Integer.parseInt(newText.charAt(i + 1) + "");
                strength += number;
            } else {
                if (strength > 0) {
                    newText.delete(i, i+1);
                    strength--;
                    i--;
                }
            }
        }
        System.out.println(newText.toString());
    }
}