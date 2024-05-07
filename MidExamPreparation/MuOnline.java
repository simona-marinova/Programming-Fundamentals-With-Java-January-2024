package FundamentalsMidExamPreparation;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] rooms = input.split("\\|");
        int maxNumber =Integer.MIN_VALUE;
        int health = 100;
        int bitcoins = 0;
        for (int i = 0; i <= rooms.length - 1; i++) {
            String[] oneRoom = rooms[i].split(" ");
            String text = oneRoom[0];
            String num = oneRoom[1];
            int number = Integer.parseInt(num);
            switch (text) {
                case "potion":
                    if(health+number >100) {
                        number=100-health;
                        health=100;
                    }
                    else {
                        health += number;
                    }
                    System.out.printf("You healed for %d hp.%n", number);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    bitcoins += number;
                    if(number>maxNumber) {
                        maxNumber=number;
                    }
                    System.out.printf("You found %d bitcoins.%n", number);
                    break;
                default:
                    health-=number;
                    if(health>0) {
                        System.out.printf("You slayed %s.%n", text);
                    }
                    else {
                        System.out.printf("You died! Killed by %s.%n", text );
                        System.out.printf("Best room: %d%n", i+1);
                        return;
                    }
                    break;
            }

        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d", health);


    }
}