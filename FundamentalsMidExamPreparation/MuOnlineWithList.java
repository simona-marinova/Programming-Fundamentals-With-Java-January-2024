package FundamentalsMidExamPreparation;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;

public class MuOnlineWithList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        int health = 100;
        int bitcoins = 0;

        for (int i = 0; i <= rooms.size() - 1; i++) {
            String[] currentRoom = rooms.get(i).split(" ");
            String command = currentRoom[0];
            int number = Integer.parseInt(currentRoom[1]);
            if (command.equals("potion")) {
                int numberTwo = 100 - health;
                health = health + number;
                if (health > 100) {
                    health = 100;
                    number = numberTwo;
                }
                System.out.printf("You healed for %d hp.%n", number);
                System.out.printf("Current health: %d hp.%n", health);
            } else if (command.equals("chest")) {
                number = Integer.parseInt(currentRoom[1]);
                bitcoins+=number;
                System.out.printf("You found %d bitcoins.%n", number);

            } else {
                number = Integer.parseInt(currentRoom[1]);
                health -= number;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", currentRoom[0]);

                } else {
                    System.out.printf("You died! Killed by %s.%n", currentRoom[0]);
                    System.out.printf("Best room: %d", i);
                    return;
                }
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d", health);

    }
}
