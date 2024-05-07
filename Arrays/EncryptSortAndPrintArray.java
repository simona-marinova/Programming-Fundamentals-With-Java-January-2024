package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int number = 0;
        int[] numbers = new int[n];

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            sum = 0;
            for (int j = 0; j < name.length(); j++) {
                char symbol = name.charAt(j);
                boolean isVowel = (int) symbol == 65 || (int) symbol == 69 || (int) symbol == 73 ||
                        (int) symbol == 79 || (int) symbol == 85  || (int) symbol == 97 ||
                        (int) symbol == 101 || (int) symbol == 111 || (int) symbol == 117 || (int) symbol == 105;
                if (isVowel) {
                    number = (int) symbol * name.length();
                } else {
                    number = ((int) symbol) / name.length();
                }
                sum += number;
            }
            numbers[i - 1] = sum;
        }

        Arrays.sort(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }

    }
}
