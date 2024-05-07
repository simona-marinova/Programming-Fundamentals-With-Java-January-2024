package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print( new DecimalFormat("0.####").format(power(number,n)));

    }

    public static double power(double number, int n) {
        double power = Math.pow(number, n);
        return power;
    }
}
