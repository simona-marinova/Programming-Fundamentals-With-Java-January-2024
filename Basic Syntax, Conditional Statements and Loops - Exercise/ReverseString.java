package PFBasicOverviewExercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reversed = "";

        for (int i = input.length()-1; i >=0 ; i--) {
            char symbol = input.charAt(i);
            reversed=reversed+symbol;
        }
        System.out.println(reversed);
    }
}
