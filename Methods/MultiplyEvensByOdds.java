package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int number = Integer.parseInt(scanner.nextLine());
int result = multiplyEvensByOdds(number);
        System.out.println(result);

    }

    public static int multiplyEvensByOdds (int number) {
       number = Math.abs(number);
        String numberOne = number + "";
        int evenSum=0;
        int oddSum=0;
        for (int i = 0; i <=numberOne.length()-1 ; i++) {
          char digit = numberOne.charAt(i);
          String dig = digit + "";
            int currentDigit = Integer.parseInt(dig);
            if(currentDigit%2==0) {
                evenSum+=currentDigit;
            }
            else {
                oddSum+=currentDigit;
            }
        }
        int result = evenSum*oddSum;
       return result;
    }
}
