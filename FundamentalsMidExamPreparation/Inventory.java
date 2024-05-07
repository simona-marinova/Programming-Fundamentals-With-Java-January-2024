package FundamentalsMidExamPreparation;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Craft!")) {
            String[] commands = command.split(" - ");
            switch (commands[0]) {
                case "Collect":
                    String item=commands[1];
                    boolean exists = ifExists(item, items);
                    if(exists) {
                        command=scanner.nextLine();
                        continue;
                    }
                    else {
                        items.add(item);
                    }
                    break;
                case "Drop":
                    item=commands[1];
                    exists = ifExists(item, items);
                    if(exists) {
                        items.remove(item);
                    }
                    break;
                case "Combine Items":
                    String [] data = commands[1].split(":");
                    String itemOne = data[0];
                    String itemTwo = data[1];
                    exists=ifExists(itemOne,items);
                    if(exists) {
                        int index = items.indexOf(itemOne);
                        items.add(index+1, itemTwo);
                    }
                    else {
                        command=scanner.nextLine();
                        continue;
                    }
                    break;
                case "Renew":
                   item=commands[1];
                   exists=ifExists(item,items);
                    if(exists) {
                        String itemToMove = item;
                        items.remove(itemToMove);
                        items.add(itemToMove);
                    }
                    else {
                        command=scanner.nextLine();
                        continue;
                    }
                    break;


            }
            command = scanner.nextLine();
        }
        System.out.print(String.join(", ", items));
    }
        public static boolean ifExists (String item, List<String> items) {
            boolean exists=false;
            for(String current:items) {
                if(current.equals(item)) {
                    exists = true;
                }
            }
            return exists;
        }

}
