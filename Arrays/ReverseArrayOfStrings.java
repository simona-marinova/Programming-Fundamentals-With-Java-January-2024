package Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] symbols = (scanner.nextLine().split(" "));

        for (int i = symbols.length-1; i >=0 ; i--) {
            System.out.print(symbols[i] + " ");
        }


    }
}
