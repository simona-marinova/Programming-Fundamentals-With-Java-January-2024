package Methods;

import java.util.Scanner;
import java.util.Arrays;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());
printTheSmallestNumber(numberOne,numberTwo, numberThree);

    }

    public static void printTheSmallestNumber (int numberOne, int numberTwo, int numberThree) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int [3];
                numbers[0] = numberOne;
        numbers[1] = numberTwo;
        numbers[2] = numberThree;
        Arrays.sort(numbers);
        System.out.println(numbers[0]);

    }
}
