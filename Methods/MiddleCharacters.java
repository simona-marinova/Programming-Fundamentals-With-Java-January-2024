package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printMiddleCharacters(text);
    }
    public static void printMiddleCharacters(String text) {
          if (text.length() % 2 == 0) {
                int middleIndex = text.length() / 2;
                int middleIndexTwo = text.length() / 2 - 1;
                System.out.print(text.charAt(middleIndexTwo));
                System.out.print(text.charAt(middleIndex));}
        else {
                int middleIndex = text.length() / 2;
                System.out.print(text.charAt(middleIndex));
            }
        }
    }

