package TextProcessing;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        int firstAscii = (int) first;
        char second = scanner.nextLine().charAt(0);
        int secondAscii = (int) second;
        int sum = 0;
        String text = scanner.nextLine();
        char[] symbols = text.toCharArray();
        for (int i = 0; i <=symbols.length-1; i++) {
            char currentSymbol = symbols[i];
            if((int) currentSymbol >firstAscii && (int) currentSymbol<secondAscii) {
                sum+=(int) currentSymbol;
            }
        }
        System.out.println(sum);

    }
}
