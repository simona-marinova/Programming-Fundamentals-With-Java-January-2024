package PFDataTypesAndVariables;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program to enter an integer number of centuries and
        // convert it to years, days, hours, and minutes.

        byte n = Byte.parseByte(scanner.nextLine());
        short years = (short) (n*100);
        double days = years*365.2422;
        double hours = days*24;
        double minutes = hours*60;
        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", n, years, days, hours, minutes);





    }
}
