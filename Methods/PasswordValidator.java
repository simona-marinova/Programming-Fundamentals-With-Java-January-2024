package Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        //•	6 – 10 characters (inclusive);
boolean consistsOfSixToTenCharacters = consistsOfSixToTenCharacters(password);
        //•	Consists only of letters and digits;
boolean consistsOnlyLettersAndDigits = consistsOnlyLettersAndDigits(password);
        //•	Have at least 2 digits.
boolean haveAtLeastTwoDigits = haveAtLeastTwoDigits(password);

if(consistsOfSixToTenCharacters&&consistsOnlyLettersAndDigits&&haveAtLeastTwoDigits) {
    System.out.println("Password is valid");
}
if(!consistsOfSixToTenCharacters) {
    System.out.println("Password must be between 6 and 10 characters");
}
if(!consistsOnlyLettersAndDigits) {
    System.out.println("Password must consist only of letters and digits");
}
if(!haveAtLeastTwoDigits) {
    System.out.println("Password must have at least 2 digits");
}

    }
    public static boolean consistsOfSixToTenCharacters (String password) {
        return password.length()>=6 && password.length()<=10;
    }

    public static boolean consistsOnlyLettersAndDigits (String password) {
        for (char symbol:password.toCharArray()) {
            if(!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean haveAtLeastTwoDigits (String password) {
        int count=0;
        for (char symbol:password.toCharArray()) {
            if(Character.isDigit(symbol)) {
                count++;
            }
        }
        return count>=2;
    }
}