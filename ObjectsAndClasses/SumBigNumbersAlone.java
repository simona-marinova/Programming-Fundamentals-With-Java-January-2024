package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbersAlone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger numberOne = new BigInteger(scanner.nextLine());
        BigInteger numberTwo = new BigInteger(scanner.nextLine());
BigInteger sum = numberOne.add(numberTwo);
        System.out.println(sum);

    }
}
