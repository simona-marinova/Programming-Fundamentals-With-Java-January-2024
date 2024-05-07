package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] deamons = input.split("[,\\s+]+");
        String regex = "[^0-9+\\-*\\/.]+";
        String regexTwo = "\\-?\\d+\\.?\\d*";
        Pattern pattern = Pattern.compile(regex);
        Pattern patternTwo = Pattern.compile(regexTwo);

        for (int i = 0; i <= deamons.length - 1; i++) {
            String deamon = deamons[i];
            StringBuilder health = new StringBuilder();
            Matcher matcher = pattern.matcher(deamon);
            Matcher matcherTwo = patternTwo.matcher(deamon);
            String regexThree = "[*\\/]";
            Pattern patternThree = Pattern.compile(regexThree);
            Matcher matcherThree = patternThree.matcher(deamon);
            double sumNumbers = 0;
            while (matcher.find()) {
                health.append(matcher.group());

            }
            while (matcherTwo.find()) {
                double number = Double.parseDouble(matcherTwo.group());
                sumNumbers += number;
            }
            int sumHealth = 0;
            for (int j = 0; j <= health.length() - 1; j++) {
                int ascii = (int) health.charAt(j);
                sumHealth += ascii;
            }
            while (matcherThree.find()) {
                String symbol = matcherThree.group();
                if (symbol.equals("*")) {
                    sumNumbers = sumNumbers * 2;
                } else {
                    sumNumbers = sumNumbers / 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n", deamon, sumHealth, sumNumbers);
        }
    }
}