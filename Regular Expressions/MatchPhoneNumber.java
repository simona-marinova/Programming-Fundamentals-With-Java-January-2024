package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\+359([ -])2\\1[0-9]{3}\\1[0-9]{4}\\b";
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List <String> numbers = new ArrayList<>();


while(matcher.find()) {
    numbers.add(matcher.group());
}

        System.out.println(String.join(", ", numbers));
    }
}
