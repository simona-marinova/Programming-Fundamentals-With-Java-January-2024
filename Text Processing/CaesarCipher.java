package TextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder cipher = new StringBuilder();

        for (int i = 0; i <=text.length()-1 ; i++) {
            char currentSymbol = text.charAt(i);
            int cipherAscii = currentSymbol+3;
            char cipherSymbol = (char) cipherAscii;
            cipher.append(cipherSymbol);
        }
        System.out.println(cipher.toString());
    }
}
