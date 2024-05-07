package Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo =Integer.parseInt(scanner.nextLine());
double result = getFactorial(numberOne)*1.0/getFactorial(numberTwo);
        System.out.printf("%.2f", result);
    }
    public static double getFactorial (int numberOne) {
       long factorial =1;
        for (int i = 2; i <=numberOne ; i++) {
            factorial=factorial*i;
        }

        return factorial;
    }
}
