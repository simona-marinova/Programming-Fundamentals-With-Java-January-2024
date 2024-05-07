package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// от класа Scanner създаваме нов обект scanner чрез конструктора Scanner. System.in - който приема някакъв поток)
 // Scanner-а има някакви полета които го описват и има методи. Чрез методите му ние сме описали действията
        //които може да прави.
        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        // искам този скенер да ми използва функционалността nextLine
        BigInteger secondNumber = new BigInteger(scanner.nextLine());
        //това са обекти.Имаме един клас BigInteger. New BigInteger - нови обекти от класа BigInteger.(scanner.nextLine)-
        // този текст се превръща в стойност на моето число.
        System.out.println(firstNumber.add(secondNumber));

    }
}
