package FundamentalsMidExamPreparation;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] groceries = scanner.nextLine().split("!");
        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String[] commandList = input.split(" ");
            String command = commandList[0];
            switch (command) {
                case "Urgent":
                    String item = commandList[1];
                    boolean exists = exists(groceries, item);
                    if(exists) {
                        input=scanner.nextLine();
                        continue;
                    } else {
                        String[] groceriesTwo = new String[groceries.length + 1];
                        groceriesTwo[0] = item;
                        for (int j = 0; j <= groceries.length - 1; j++) {
                            groceriesTwo[j + 1] = groceries[j];
                        }
                        groceries=groceriesTwo;
                    }
                    break;
                case "Unnecessary":
                    item = commandList[1];
                    exists = exists(groceries, item);
                    if(!exists) {
                        input=scanner.nextLine();
                        continue;
                    }
                    else {
                        int position = position(groceries, item);
                        String[] groceriesTwo = new String[groceries.length - 1];
                        for (int i = 0; i < position; i++) {
                            groceriesTwo[i] = groceries[i];
                        }
                        for (int i = position + 1; i <= groceries.length - 1; i++) {
                            groceriesTwo[i - 1] = groceries[i];
                        }
                        groceries = groceriesTwo;
                    }

                    break;
                case "Correct":
                    item = commandList[1];
                    String newItem = commandList[2];
                    exists = exists(groceries, item);
                    if (!exists) {
                        input=scanner.nextLine();
                        continue;
                    } else {
                        int position = position(groceries, item);
                        groceries[position] = newItem;
                    }
                    break;
                case "Rearrange":
                    item = commandList[1];
                    exists = exists(groceries, item);
                    if(!exists) {
                        input=scanner.nextLine();
                        continue;
                    }
                    else {
                        int position = position(groceries,item);
                        String groceriesTwo [] = new String[groceries.length];
                        groceriesTwo[groceriesTwo.length-1] = groceries[position];
                        for (int i = 0; i <position ; i++) {
                            groceriesTwo[i]=groceries[i];
                        }
                        for (int i = position; i <groceriesTwo.length-1 ; i++) {
                            groceriesTwo[i]=groceries[i+1];
                        }
                        groceries=groceriesTwo;
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.print(String.join(", ", groceries));
    }

    public static boolean exists(String[] groceries, String item) {
        boolean exists = false;
        for (int i = 0; i <= groceries.length - 1; i++) {
            if (groceries[i].equals(item)) {
                exists = true;
            }
        }
        return exists;
    }

    public static int position(String[] groceries, String item) {
        int position = 0;
        for (int i = 0; i <= groceries.length - 1; i++) {
            if (groceries[i].equals(item)) {
                position = i;
            }
        }
        return position;
    }
}



