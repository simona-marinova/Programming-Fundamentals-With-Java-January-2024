package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println("Bought furniture:");
double sum=0;
        while (!input.equals("Purchase")) {
            //">>{furniture name}<<{price}!{quantity}"
            String regex = "[>]{2}(?<name>[A-Za-z]+)[<]{2}(?<price>[0-9.]+)!(?<quantity>[0-9]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher mathcer = pattern.matcher(input);
            input = scanner.nextLine();
            while (mathcer.find()) {
                String name = mathcer.group("name");
                String price = mathcer.group("price");
                String quantity = mathcer.group("quantity");
                int quantityInt = Integer.parseInt(quantity);
                double priceDouble = Double.parseDouble(price)*quantityInt;
                sum+=priceDouble;
                System.out.println(name);
            }
        }

        System.out.printf("Total money spend: %.2f", sum);
    }
}
