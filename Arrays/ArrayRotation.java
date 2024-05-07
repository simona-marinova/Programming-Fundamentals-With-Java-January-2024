package Arrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
           String first = input[0];
            for (int j = 0; j < input.length - 1; j++) {
                input[j] = input[j + 1];
            }
           input[input.length-1] = first;
        }

        for (String text : input) {
            System.out.print(text + " ");
        }

    }
}
