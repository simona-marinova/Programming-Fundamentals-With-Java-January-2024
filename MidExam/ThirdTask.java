package FundMidExam;

import java.util.*;
import java.util.stream.Collectors;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<String> chat = new ArrayList<>();
        while (!command.equals("end")) {
            String[] commands = command.split(" ");
            String messageOne = commands[1];
            switch (commands[0]) {
                case "Chat":
                    chat.add(messageOne);
                    break;
                case "Delete":
                    chat.remove(messageOne);
                    break;
                case "Edit":
                    String editedMessage = commands[2];
                    if (chat.contains(messageOne)) {
                        int index = chat.indexOf(messageOne);
                        chat.set(index, editedMessage);
                    } else {
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Pin":
                    if (chat.contains(messageOne)) {
                        chat.remove(messageOne);
                        chat.add(messageOne);
                    } else {
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Spam":
                    for (int i = 1; i <= commands.length - 1; i++) {
                        String currentMessage = commands[i];
                        chat.add(currentMessage);
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i <= chat.size() - 1; i++) {
            System.out.println(chat.get(i));
        }

    }
}
