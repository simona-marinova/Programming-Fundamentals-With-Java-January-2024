package RegularExamFundamentals;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String concealedMessage = scanner.nextLine();
        String instructions = scanner.nextLine();

        while (!instructions.equals("Reveal")) {
            String[] commands = instructions.split("\\:\\|\\:");
            String command = commands[0];
            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(commands[1]);
                    StringBuilder newMessage = new StringBuilder(concealedMessage);
                    newMessage.insert(index, " ");
                    concealedMessage = newMessage.toString();
                    System.out.println(concealedMessage);
                    break;
                case "Reverse":
                    String substring = commands[1];
                    if (concealedMessage.contains(substring)) {
                       StringBuilder message = new StringBuilder(concealedMessage);
                        int length = substring.length();
                        int startIndex = message.indexOf(substring);
                        message.delete(startIndex, startIndex+length);
                        concealedMessage=message.toString();
                        StringBuilder sub = new StringBuilder(substring);
                        sub.reverse();
                        newMessage = new StringBuilder(concealedMessage);
                        newMessage.append(sub);
                        concealedMessage = newMessage.toString();
                        System.out.println(concealedMessage);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    substring = commands[1];
                    String replacement = commands[2];
                    concealedMessage=concealedMessage.replace(substring, replacement);
                    System.out.println(concealedMessage);
                    break;
            }


            instructions = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", concealedMessage);
    }
}
