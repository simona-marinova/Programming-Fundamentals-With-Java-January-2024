package PFBasicOverviewExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        double sum = 0;
        double moneyNeeded = 0;
        double sumMoneyNeeded = 0;

        while (!input.equals("Start")) {
            double money = Double.parseDouble(input);
            boolean isRight = money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2;
            if (isRight) {
                sum=sum+money;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();

        while (!product.equals("End")) {
            boolean isRightProduct = product.equals("Nuts") || product.equals("Water") || product.equals("Crisps")
                    || product.equals("Soda") || product.equals("Coke");
            if (isRightProduct) {
                switch (product) {
                    case "Nuts":
                        moneyNeeded = 2.0;
                        break;
                    case "Water":
                        moneyNeeded = 0.7;
                        break;
                    case "Crisps":
                        moneyNeeded = 1.5;
                        break;
                    case "Soda":
                        moneyNeeded = 0.8;
                        break;
                    case "Coke":
                        moneyNeeded = 1.0;
                        break;
                }
                if(sum>=moneyNeeded) {
                    System.out.printf("Purchased %s%n", product);
                    sum=sum-moneyNeeded;
                }
                else {
                    System.out.println("Sorry, not enough money");}

                sumMoneyNeeded = sumMoneyNeeded + moneyNeeded;
            } else {
                System.out.println("Invalid product");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
