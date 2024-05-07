package PFBasicOverviewExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        switch (day) {
            case "Friday":
                if (type.equals("Students")) {
                    price = 8.45;
                } else if (type.equals("Business")) {
                    price = 10.90;
                } else if (type.equals("Regular")) {
                    price = 15;
                }
                break;
            case "Saturday":
                if (type.equals("Students")) {
                    price = 9.80;
                } else if (type.equals("Business")) {
                    price = 15.60;
                } else if (type.equals("Regular")) {
                    price = 20;
                }
                break;
            case "Sunday":
                if (type.equals("Students")) {
                    price = 10.46;
                } else if (type.equals("Business")) {
                    price = 16;
                } else if (type.equals("Regular")) {
                    price = 22.50;
                }
                break;
        }
        double fullPrice = number*price;

        if(type.equals("Students") && number>=30) {
            fullPrice =fullPrice-0.15*fullPrice;
        }
        else if (type.equals("Business") && number>=100) {
            fullPrice=fullPrice-10*price;
        }
        else if(type.equals("Regular") && number>=10 && number<=20) {
            fullPrice = fullPrice-0.05*fullPrice;
        }

        System.out.printf("Total price: %.2f", fullPrice);
    }
}
