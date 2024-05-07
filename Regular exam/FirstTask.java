package FinalExamFundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;


public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            String[] commands = command.split(" ");
            String instruction = commands[0];
            switch (instruction) {
                case "Replace":
                    String currentChar = commands[1];
                    String newChar = commands[2];
                    String temporary = text.toString();
                    temporary = temporary.replace(currentChar, newChar);
                    text = new StringBuilder(temporary);
                    System.out.println(text);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commands[1]);
                    int endIndex = Integer.parseInt(commands[2]);
                    if (startIndex >= 0 && startIndex < text.length() && endIndex >= 0 && endIndex < text.length()) {
                        text.delete(startIndex, endIndex + 1);
                        System.out.println(text);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    String upperOrLower = commands[1];
                    if (upperOrLower.equals("Upper")) {
                        temporary = text.toString();
                        temporary = temporary.toUpperCase();
                        text = new StringBuilder(temporary);
                        System.out.println(text);
                    } else {
                        temporary = text.toString();
                        temporary = temporary.toLowerCase();
                        text = new StringBuilder(temporary);
                        System.out.println(text);
                    }
                    break;
                case "Check":
                    String message = commands[1];
                    if(text.toString().contains(message)){
                        System.out.printf("Message contains %s\n", message);
                    }
                    else {
                        System.out.printf("Message doesn't contain %s\n", message);
                    }
                    break;
                case "Sum":
                    startIndex= Integer.parseInt(commands[1]);
                    endIndex= Integer.parseInt(commands[2]);
                    if (startIndex >= 0 && startIndex < text.length() && endIndex >= 0 && endIndex < text.length()) {
                        String substring = text.substring(startIndex, endIndex + 1);
                        int sum = 0;
                        for (int i = 0; i < substring.length(); i++) {
                            char currentSymbol = substring.charAt(i);
                            sum += (int) currentSymbol;
                        }
                        System.out.println(sum);
                    }
                else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }


            command = scanner.nextLine();
        }


    }
}
