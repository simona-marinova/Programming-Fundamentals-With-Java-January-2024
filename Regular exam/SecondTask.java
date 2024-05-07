package FinalExamFundamentals;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int n = Integer.parseInt(scanner.nextLine());
        String regex = "([\\D\\d]+)\\>(?<numbers>[0-9]{3})\\|(?<smallLetters>[a-z]{3})\\|(?<letters>[A-Z]{3})\\|(?<symbols>[^\\<\\>]{3})\\<\\1";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 1; i <=n ; i++) {
            String password = scanner.nextLine();
            Matcher matcher = pattern.matcher(password);
            if(matcher.find()){
                String numbers = matcher.group("numbers");
                String smallLetters = matcher.group("smallLetters");
                String letters = matcher.group("letters");
                String symbols = matcher.group("symbols");
                String newPass = numbers+smallLetters+letters+symbols;
                System.out.printf("Password: %s\n", newPass);

            }
            else {
                System.out.println("Try another password!");
            }

        }







    }
}

