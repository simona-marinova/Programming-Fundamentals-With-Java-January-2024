package PFDataTypesAndVariables;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        short area = Short.parseShort(scanner.nextLine());

        System.out.println("Town" + " " + name + " " + "has population of " + population + " " + "and"  + " " + "area" + " " + area +  " " + "square km.");
    }
}
