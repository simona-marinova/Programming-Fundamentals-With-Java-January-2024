package TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder newBuilder = new StringBuilder();

        for (int i = 0; i <= input.length() - 1; i++) {
            if (i == 0) {
                newBuilder.append(input.charAt(i));
            } else {
                char currentSymbol = input.charAt(i);
                char previousSymbol = input.charAt(i - 1);
                if (currentSymbol != previousSymbol) {
                    newBuilder.append(currentSymbol);
                }
            }
        }
        System.out.println(newBuilder.toString());
    }
}