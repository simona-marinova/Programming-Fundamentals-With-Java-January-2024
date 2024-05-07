package RegularExamFundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex ="@[#]+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@[#]+";
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String text = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            String productGroup = "";
            boolean containsDigit = false;
            if (matcher.find()) {
                String barcode = matcher.group("barcode");
                for (int j = 0; j <= barcode.length() - 1; j++) {
                    char currentSymbol = barcode.charAt(j);
                    if (Character.isDigit(currentSymbol)) {
                        productGroup += currentSymbol;
                        containsDigit = true;
                    }
                }
                if (!containsDigit) {
                    productGroup = "00";
                }
                System.out.printf("Product group: %s\n", productGroup);
            } else {
                System.out.println("Invalid barcode");
            }
        }

    }
}

