package PFBasicsOverview;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age  = Integer.parseInt(scanner.nextLine());
        double price =0;
        if (age<0 || age >122) {
            System.out.println("Error!");
            return;
        }


        switch(day) {
            case "Weekday":
                if (age >=0 &&age<=18) {
                    price =12;}
                else if (age<=64) {
                    price = 18;
                }
                else if(age<=122) {
                    price=12;
                }
                break;
            case "Weekend":
                if (age<=18) {
                    price =15;}
                else if (age<=64) {
                    price = 20;
                }
                else if(age<=122) {
                    price=15;
                }
                break;
            case "Holiday":
                if (age<=18) {
                    price =5;}
                else if (age<=64) {
                    price = 12;
                }
                else if(age<=122) {
                    price=10;
                }
                break;

        }
        System.out.printf("%.0f$", price);


    }
}
