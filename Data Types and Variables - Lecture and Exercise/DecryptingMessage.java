package PFDataTypesAndVariables;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String name = "";

        for (int i = 1; i <=n ; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int number = (int) symbol + key;
            char newSymbol = (char) number;
            name = name + newSymbol;
        }
        System.out.println(name);
    }
}
