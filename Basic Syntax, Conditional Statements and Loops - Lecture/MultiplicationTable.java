package PFBasicsOverview;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int multiplier = 1; multiplier <=10 ; multiplier++) {
            System.out.println(number + " " + "X" + " " + multiplier + " " + "=" + " " + number*multiplier);

        }
    }
}
