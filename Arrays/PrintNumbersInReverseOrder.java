package Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];


        for (int position = 0; position <=numbers.length -1; position++) {
            numbers[position] = Integer.parseInt(scanner.nextLine());

        }

        for (int positionTwo = numbers.length-1; positionTwo >=0 ; positionTwo--) {
            System.out.print(numbers[positionTwo]+ " ");
        }

    }
}
