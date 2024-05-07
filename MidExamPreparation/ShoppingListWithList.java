package FundamentalsMidExamPreparation;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class ShoppingListWithList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")) {
            String[] commands = command.split(" ");
            switch (commands[0]) {
                case "Urgent":
                    String item = commands[1];
                    boolean exists=ifExists(item,items);
                    if(exists) {
                        command=scanner.nextLine();
                        continue;
                    }
                    else {
                        items.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    item=commands[1];
                    exists=ifExists(item,items);
                    if(!exists) {
                        command=scanner.nextLine();
                        continue;
                    }
                    else {
                        items.remove(item);
                    }
                    break;
                case "Correct":
                    item=commands[1];
                    exists=ifExists(item,items);
                    if(!exists) {
                        command=scanner.nextLine();
                        continue;
                    }
                    else {
                      int index=items.indexOf(item);
                      items.set(index,commands[2]);
                    }
                    break;
                case "Rearrange":
                    item=commands[1];
                    exists=ifExists(item,items);
                    if(!exists) {
                        command=scanner.nextLine();
                        continue;
                    }
                    else {
                        items.remove(item);
                      items.add(items.size()-1,item);
                    }
                    break;
            }


            command = scanner.nextLine();
        }
        for (int i = 0; i <=items.size()-1 ; i++) {
            if(i!=items.size()-1) {
                System.out.print(items.get(i) + "," + " ");
            }
            else {
                System.out.print(items.get(i));
            }
        }
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
