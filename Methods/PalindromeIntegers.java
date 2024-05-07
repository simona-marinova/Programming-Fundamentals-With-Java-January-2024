package Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(!input.equals("END")) {
isPalindrome(input);
            input=scanner.nextLine();
        }
    }
    public static void isPalindrome (String input) {
        Scanner scanner = new Scanner(System.in);
                String reversed = "";
                for (int i = input.length()-1; i >=0 ; i--) {

                    char currentSymbol = input.charAt(i);
                    reversed +=currentSymbol;
                }
                if(reversed.equals(input)) {
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
            }
        }


