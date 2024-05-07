package Methods;

import java.util.Scanner;

public class CharacterInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbolOne = scanner.nextLine().charAt(0);
        char symbolTwo = scanner.nextLine().charAt(0);
        charactersInRangeBetween(symbolOne, symbolTwo);

    }

    public static void charactersInRangeBetween(char symbolOne, char symbolTwo) {
        //int symbolFirst = (int) symbolOne;
       // int symbolSecond = (int) symbolTwo;
        if (symbolOne < symbolTwo) {
            for (int i = symbolOne + 1; i < symbolTwo; i++) {
               // int currentSymbol = i;
              //  char current = (char) currentSymbol;
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = symbolTwo + 1; i < symbolOne; i++) {
               // int currentSymbol = i;
               // char current = (char) currentSymbol;
                System.out.print((char) i + " ");
            }
        }
    }
}