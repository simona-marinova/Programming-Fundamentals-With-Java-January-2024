package PFBasicOverviewExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        int length = username.length();
        String pass = "";
        int count = 0;

        for (int i = length - 1; i >= 0; i--) {
            char symbol = username.charAt(i);
            pass = pass + symbol;
        }

        String input = scanner.nextLine();

        while (!input.equals(pass)) {
            count++;
            if (count == 4) {
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }

        System.out.printf("User %s logged in.", username);
    }
}
