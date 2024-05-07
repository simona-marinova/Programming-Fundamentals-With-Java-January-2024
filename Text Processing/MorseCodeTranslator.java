package TextProcessing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> morseCode = new LinkedHashMap<>();
        morseCode.put(".-", "A");
        morseCode.put("-...", "B");
        morseCode.put("-.-.", "C");
        morseCode.put("-..", "D");
        morseCode.put(".", "E");
        morseCode.put("..-.", "F");
        morseCode.put("--.", "G");
        morseCode.put("....", "H");
        morseCode.put("..", "I");
        morseCode.put(".---", "J");
        morseCode.put("-.-", "К");
        morseCode.put(".-..", "L");
        morseCode.put("--", "M");
        morseCode.put("-.", "N");
        morseCode.put("---", "O");
        morseCode.put(".--.", "P");
        morseCode.put("--.-", "Q");
        morseCode.put(".-.", "R");
        morseCode.put("...", "S");
        morseCode.put("-", "T");
        morseCode.put("..-", "U");
        morseCode.put("...-", "V");
        morseCode.put(".--", "W");
        morseCode.put("-..-", "X");
        morseCode.put("-.--", "Y");
        morseCode.put("--..", "Z");
        morseCode.put("|", " ");

String input = scanner.nextLine();

String [] text = input.split(" ");

        for (int i = 0; i <=text.length-1 ; i++) {
            String currentWord = text[i];
            String letter = morseCode.get(currentWord);
            System.out.print(letter);
        }
    }
}
