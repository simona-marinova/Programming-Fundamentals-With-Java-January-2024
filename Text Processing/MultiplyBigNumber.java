package TextProcessing;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger numberOne = new BigInteger(scanner.nextLine());
        BigInteger numberTwo = new BigInteger(scanner.nextLine());

        BigInteger multipliedNumbers = numberOne.multiply(numberTwo);

        System.out.println(multipliedNumbers);




    }
}
