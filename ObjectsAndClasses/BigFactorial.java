package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        BigInteger factorial = new BigInteger("1");
        //при създаване на BIgInteger стойността се пише в кавички, защото е String, който после се
        //преобразува в число.

        for (int i = 1; i <=number ; i++) {
            factorial=factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);

    }
}
