package Methods;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
closestPoint(x1,y1,x2,y2);

    }

    public static void closestPoint( double x1, double y1, double x2, double y2) {
        double first = Math.pow(Math.abs(x1), 2);
        double second = Math.pow(Math.abs(y1), 2);
        double resultFirst = first+second;
        double resultSecond= Math.pow(Math.abs(x2), 2) + Math.pow(Math.abs(y2), 2);
        if(resultFirst<resultSecond) {
            System.out.printf("("+ "%.0f" + "," + " " + "%.0f" + ")", x1, y1);
        }
        else if(resultFirst>resultSecond) {
            System.out.printf("("+ "%.0f" + "," + " " + "%.0f" + ")", x2, y2);
        }
        else if(resultFirst==resultSecond) {
            System.out.printf("("+ "%.0f" + "," + " " + "%.0f" + ")", x1, y1);
        }
    }
}
