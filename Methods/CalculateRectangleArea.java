package Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int numberOne = Integer.parseInt(scanner.nextLine());
int numberTwo = Integer.parseInt(scanner.nextLine());
int area = area(numberOne,numberTwo);
        System.out.println(area);

    }

    public static int area (int numberOne, int numberTwo) {
        return numberOne*numberTwo;
    }
}
