package Methods;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int numberTwo = Integer.parseInt(scanner.nextLine());
        System.out.println(result(numberOne,operator,numberTwo));

    }

    public static int result (int numberOne, String operator, int numberTwo) {
        int result=0;
        switch (operator) {
            case "/":
                result=numberOne/numberTwo;
                break;
            case "*":
                result = numberOne*numberTwo;
                break;
            case"+":
                result = numberOne+numberTwo;
                break;
            case "-":
                result=numberOne-numberTwo;
                break;
        }

        return result;
    }
}
