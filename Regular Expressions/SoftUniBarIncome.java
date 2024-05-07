package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sumPrice =0;

        while (!input.equals("end of shift")) {
            //Each valid order should have a customer, product, count, and price:
            String regex = "\\%(?<customer>[A-Z][a-z]+)\\%[^\\|\\$\\%\']*<(?<product>\\w+)>[^\\|\\$\\%\']*\\|(?<count>\\d+)\\|[^\\|\\$\\%\']*?(?<price>\\d+\\.?\\d*)\\$";
//For each valid line print on the console: "{customerName}: {product} - {totalPrice}"
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalPrice = count * price;
                sumPrice+=totalPrice;
                System.out.printf("%s: %s - %.2f%n", customer,product, totalPrice);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",sumPrice);
    }
}
