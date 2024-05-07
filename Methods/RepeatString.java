package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String concatenatInput = concatenatedInput(input, n);
        System.out.println(concatenatInput);
    }

    public static String concatenatedInput(String input, int n) {
        String inputTwo="";
        for (int i = 1; i <= n; i++) {
            inputTwo += input;

        }
        return inputTwo;
    }
}
