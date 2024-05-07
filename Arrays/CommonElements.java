package Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String [] inputTwo = scanner.nextLine().split(" ");

        for (String textTwo : inputTwo) {
            for (String text : input) {
                if (textTwo.equals(text)) {
                    System.out.print(textTwo + " ");
            }
        }
        }
        
    }
}
