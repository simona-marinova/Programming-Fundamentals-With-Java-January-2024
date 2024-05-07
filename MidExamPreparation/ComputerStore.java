package FundamentalsMidExamPreparation;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
   double fullPrice=0;
    double fullTax= 0;

        while(!input.equals("special") && !input.equals("regular" )) {
         double price = Double.parseDouble(input);
         if(price<0) {
             System.out.println("Invalid price!");
             input=scanner.nextLine();
             continue;
            }
         else if(price==0) {
             System.out.println("Invalid order!");
             input=scanner.nextLine();
             continue;
         }
fullPrice+=price;
          double tax=0.20*price;
          fullTax+=tax;
            input=scanner.nextLine();
        }
        if(fullPrice==0) {
            System.out.println("Invalid order!" );
            return;
        }
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", fullPrice);
        System.out.printf("Taxes: %.2f$%n", fullTax);
        System.out.println("-----------");
                if(input.equals("special")) {
                    System.out.printf("Total price: %.2f$", (fullPrice + fullTax) - 0.10 * (fullTax + fullPrice));
                }
                else {
                    System.out.printf("Total price: %.2f$", fullPrice+fullTax);
                }

    }
}
