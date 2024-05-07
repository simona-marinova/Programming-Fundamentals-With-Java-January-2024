package RegularExamFundamentals;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "([#|])(?<itemName>[A-Za-z]+[ ]?[A-Za-z]+)\\1(?<expirationDate>\\d{2}[\\/]\\d{2}[\\/]\\d{2})\\1(?<calories>\\d+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int totalCalories = 0;
        List <String> items = new ArrayList<>();

        while (matcher.find()) {
            String name = matcher.group("itemName");
            String date = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));
            totalCalories+=calories;
            items.add(String.format("Item: %s, Best before: %s, Nutrition: %d", name, date, calories));
        }
        int days = totalCalories/2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        for (String item : items) {
            System.out.println(item);
        }
            }
        }

