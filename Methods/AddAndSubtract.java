package Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne= Integer.parseInt(scanner.nextLine());
        int numberTwo= Integer.parseInt(scanner.nextLine());
        int numberThree= Integer.parseInt(scanner.nextLine());

        int sum = getSum(numberOne,numberTwo);
        int result = getSubtract(sum, numberThree);
        System.out.println(result);
    }
    public static int getSum (int numOne, int numTwo) {
        int sum = numOne+numTwo;
        return sum;
    }

    public static int getSubtract (int sum, int numThree) {
        int result = sum-numThree;
        return result;
    }
}
