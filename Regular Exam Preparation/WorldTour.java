package RegularExamFundamentals;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);
        String command = scanner.nextLine();

        while (!command.equals("Travel")) {
            String[] commands = command.split(":");
            String instruction = commands[0];
            switch (instruction) {
                case "Add Stop":
                    int index = Integer.parseInt(commands[1]);
                    String string = commands[2];
                    if (index >= 0 && index < text.length()) {
                        text.insert(index, string);
                    }
                    System.out.println(text.toString());
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commands[1]);
                    int endIndex = Integer.parseInt(commands[2]);
                    if(startIndex>=0 && startIndex<text.length() && endIndex>=0 && endIndex<text.length()){
                        text.delete(startIndex,endIndex+1);
                    }
                    System.out.println(text.toString());
                    break;
                case "Switch":
                    String oldString = commands[1];
                    String newString = commands[2];
                    if(text.toString().contains(oldString)){
                        String temporaryString = text.toString();
                        temporaryString=temporaryString.replace(oldString, newString);
                        text = new StringBuilder(temporaryString);
                    }
                    System.out.println(text.toString());
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s\n",text.toString());

    }
}
