package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfProduct=scanner.nextLine();
        int quantity= Integer.parseInt(scanner.nextLine());
        calculateAndPrintPrice(typeOfProduct,quantity);
    }
    public static void calculateAndPrintPrice (String type, int quantity) {
        double price=0;
        switch (type) {
            case "coffee":
              price=1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price =1.40;
                break;
            case "snacks":
                price=2.00;
                break;
        }
price=price*quantity;
        System.out.printf("%.2f", price);

    }
}
