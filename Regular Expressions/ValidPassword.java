package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\_\\.+(?<pass>[A-Z][A-Za-z0-9]{4,}[A-Z])\\_\\.+";
        int n= Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            String text = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            if(matcher.find()) {
               String password = matcher.group("pass");
                StringBuilder concatenatedNumbers = new StringBuilder("");
               int length = password.length();
                boolean isDigit=false;
                for (int j = 0; j <=length-1 ; j++) {
                    char currentSymbol = password.charAt(j);
                    if(Character.isDigit(currentSymbol)) {
                        concatenatedNumbers.append(currentSymbol);
                        isDigit=true;
                    }
                }
                if(!isDigit) {
                    System.out.println("Group: default");
                }
                else {
                    System.out.println("Group:" + " " + concatenatedNumbers);
                }
            }
            else {
                System.out.println("Invalid pass!");
            }
        }
    }
}
