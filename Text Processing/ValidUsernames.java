package TextProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] userNames = input.split(", ");

        for (int i = 0; i <=userNames.length - 1; i++) {
            String currentUserName = userNames[i];
boolean isValid = isItValid(currentUserName);
if(isValid) {
    System.out.println(currentUserName);
}
        }
    }


    public static boolean isItValid(String word) {
        boolean isValid = true;
        int length = word.length();
        if (length >= 3 && length <= 16) {
            for (int j = 0; j <= word.length() - 1; j++) {
                char currentSymbol = word.charAt(j);
                if (!Character.isDigit(currentSymbol) && !Character.isLetter(currentSymbol) && currentSymbol != '-' &&
                        currentSymbol != '_') {
                    isValid = false;
                }
            }
        } else {
            isValid = false;
        }
        return isValid;
    }
}