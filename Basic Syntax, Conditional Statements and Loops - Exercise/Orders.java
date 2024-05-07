package PFBasicOverviewExercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money=0;
        double moneySum=0;

        int countOrders = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=countOrders ; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days =Integer.parseInt(scanner.nextLine());
            int numberCapsules = Integer.parseInt(scanner.nextLine());
            money = days*numberCapsules*price;
            moneySum=moneySum+money;
            System.out.printf("The price for the coffee is: $%.2f%n", money);

        }
        System.out.printf("Total: $%.2f",moneySum);
    }
}
