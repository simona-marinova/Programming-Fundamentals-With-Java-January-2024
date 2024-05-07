package TextProcessing;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            String input = scanner.nextLine();
            int indexOne = input.indexOf("@");
            int indexTwo = input.indexOf("|");
            String name = input.substring(indexOne+1,indexTwo);
            indexOne = input.indexOf("#");
            indexTwo=input.indexOf("*");
            String age = input.substring(indexOne +1,indexTwo);
            System.out.printf("%s is %s years old.%n", name, age);
        }

    }
}
