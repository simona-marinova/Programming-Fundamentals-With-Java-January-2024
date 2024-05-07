package RegularExamFundamentals;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder username = new StringBuilder(input);
        String command = scanner.nextLine();

        while (!command.equals("Registration")) {
            String[] commands = command.split(" ");
            String instruction = commands[0];
            switch (instruction) {
                case "Letters":
                    String lowerOrUpper = commands[1];
                    String temporaryString = username.toString();
                    if (lowerOrUpper.equals("Lower")) {
                        temporaryString=temporaryString.toLowerCase();
                        username= new StringBuilder(temporaryString);
                        }
                   else {
                        temporaryString=temporaryString.toUpperCase();
                        username=new StringBuilder(temporaryString);
                        }
                    System.out.println(username);
                    break;
                case "Reverse":
                    int startIndex = Integer.parseInt(commands[1]);
                    int endIndex = Integer.parseInt(commands[2]);
                    if (startIndex >= 0 && startIndex < username.length() && endIndex >= 0 && endIndex < username.length()) {
                        StringBuilder substring = new StringBuilder(username.substring(startIndex, endIndex + 1));
                        substring.reverse();
                        System.out.println(substring.toString());
                    } else {
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Substring":
                    String substring = commands[1];
                    if (username.toString().contains(substring)) {
                        startIndex = username.indexOf(substring);
                        endIndex = startIndex + substring.length();
                        username.delete(startIndex, endIndex);
                        System.out.println(username);
                    } else {
                        System.out.printf("The username %s doesn't contain %s.\n", username.toString(), substring);
                    }
                    break;
                case "Replace":
                    String symbol = commands[1];
                    String temporaryUsername = username.toString();
                    temporaryUsername = temporaryUsername.replace(symbol, "-");
                    username = new StringBuilder(temporaryUsername);
                    System.out.println(username);
                    break;
                case "IsValid":
                    symbol = commands[1];
                    if (username.toString().contains(symbol)) {
                        System.out.println("Valid username.");
                    } else {
                        System.out.printf("%s must be contained in your username.\n", symbol);
                    }
                    break;

            }
            command = scanner.nextLine();
        }
    }
}
