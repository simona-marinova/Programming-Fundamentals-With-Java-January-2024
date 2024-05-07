package FundMidExam;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> vehicles = Arrays.stream(scanner.nextLine().split(">>")).collect(Collectors.toList());
        double allTaxess = 0;
        for (int i = 0; i <= vehicles.size() - 1; i++) {
            String[] text = vehicles.get(i).split(" ");
            String carType = text[0];
            int years = Integer.parseInt(text[1]);
            int km = Integer.parseInt(text[2]);
            if (!carType.equals("family") && !carType.equals("heavyDuty") && !carType.equals("sports")) {
                System.out.println("Invalid car type.");
                continue;
            } else {
                switch (carType) {
                    case "family":
                        double initialTax = 50;
                        int number = km / 3000;
                        double tax = number * 12 + (initialTax - years * 5);
                        allTaxess += tax;
                        System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, tax);
                        break;
                    case "heavyDuty":
                        initialTax = 80;
                        number = km / 9000;
                        tax = number * 14 + (initialTax - years * 8);
                        allTaxess += tax;
                        System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, tax);
                        break;
                    case "sports":
                        initialTax = 100;
                        number = km / 2000;
                        tax = number * 18 + (initialTax - years * 9);
                        allTaxess += tax;
                        System.out.printf("A %s car will pay %.2f euros in taxes.%n", carType, tax);
                        break;

                }
            }

        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", allTaxess);

    }
}
