package RegularExamFundamentals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BakeryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = scanner.nextLine();
        Map<String, Integer> products = new LinkedHashMap<>();
        int soldItems=0;

        while(!commands.equals("Complete")) {
            String [] instructions = commands.split(" ");
            String command = instructions[0];
            int quantity = Integer.parseInt(instructions[1]);
            String food = instructions[2];
            switch (command) {
                case "Receive":
                    if(quantity<=0){
                        commands=scanner.nextLine();
                        continue;
                    }
                    else if (!products.containsKey(food)){
                        products.put(food, quantity);
                    }
                    else {
                        int currentQuantity = products.get(food);
                        products.put(food, currentQuantity+quantity);
                    }
                    break;
                case "Sell":
                    if(!products.containsKey(food)){
                        System.out.printf("You do not have any %s.\n",food);
                    }
                    else {
                        int currentQuantity = products.get(food);
                        if(currentQuantity<quantity) {
                            System.out.printf("There aren't enough %s. You sold the last %d of them.\n", food, currentQuantity);
                            soldItems+=currentQuantity;
                            products.put(food,0);
                            products.remove(food);
                        }
                        else {
                            products.put(food, currentQuantity-quantity);
                            soldItems +=quantity;
                            System.out.printf("You sold %d %s.\n", quantity, food);
                            currentQuantity=products.get(food);
                            if(currentQuantity==0){
                                products.remove(food);
                            }
                        }
                    }
                    break;
            }


            commands=scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }

        System.out.printf("All sold: %d goods", soldItems);
    }
}
