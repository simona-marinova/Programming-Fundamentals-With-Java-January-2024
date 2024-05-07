package Methods;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;
public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if (type.equals("int")) {
            int number = Integer.parseInt(scanner.nextLine());
            int result = typeInteger(number);
            System.out.println(result);
        }
        else if(type.equals("real")) {
            double number = Double.parseDouble(scanner.nextLine());
            double result = typeReal(number);
            System.out.printf("%.2f", result);
        }
        else {
            String text = scanner.nextLine();
            String result = typeString(text);
            System.out.println(result);
        }
    }
    public static int typeInteger(int number) {
         return number*2;
    }
    public static double typeReal (double number) {
        return number*1.5;
    }

    public static String typeString (String text) {
        return "$" + text + "$";
    }
}
