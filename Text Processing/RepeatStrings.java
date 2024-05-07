package TextProcessing;

import java.util.Scanner;


public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        String [] array = input.split(" ");

        for (String word : array) {
            int length = word.length();
            for (int i = 1; i <=length ; i++) {
                System.out.print(word);
            }
        }


    }
}
