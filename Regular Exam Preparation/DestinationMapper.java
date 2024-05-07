package RegularExamFundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "([\\=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1";
        int lengthSum = 0;
        List<String> destinations = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String destination = matcher.group("destination");
            int length = destination.length();
            lengthSum += length;
            destinations.add(destination);
        }
        System.out.printf("Destinations: " + String.join(", ", destinations ) + "%n");
        System.out.printf("Travel Points: %d", lengthSum);
    }
}
