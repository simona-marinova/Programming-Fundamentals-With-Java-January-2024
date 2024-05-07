package Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        if (operation.equals("add")) {
            add(firstNumber, secondNumber);
        } else if (operation.equals("multiply")) {
            multiply(firstNumber, secondNumber);
        } else if (operation.equals("subtract")) {
            subtract(firstNumber, secondNumber);
        } else if (operation.equals("divide")) {
            divide(firstNumber, secondNumber);
        }

    }

    public static void add(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }

    public static void subtract(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    public static void multiply(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    public static void divide(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }
}
