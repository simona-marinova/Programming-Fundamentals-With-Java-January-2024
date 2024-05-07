package TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input =scanner.nextLine();
        String [] bannedWords = input.split(", ");
        String text = scanner.nextLine();


        for (int i = 0; i <=bannedWords.length-1 ; i++) {
            String currentWord = bannedWords[i];
            int length = currentWord.length();
            String wordSubstitute = "*".repeat(length);
           text=text.replace(currentWord,  wordSubstitute);
        }

        System.out.println(text);
    }
}
