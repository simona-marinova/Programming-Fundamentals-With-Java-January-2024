package TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] text = input.split("\\\\");
        String last = text[text.length - 1];
        String [] words = last.split("\\.");
        String name = words[0];
        String extension = words[1];
        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);

    }
}
