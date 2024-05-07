package PFDataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
int currentYield = startingYield;
int days=0;
int amountOfSpice=0;
int sum=0;

        while (currentYield>=100) {
            days++;
            amountOfSpice=currentYield-26;
sum+=amountOfSpice;
currentYield=currentYield-10;
        }
        if(sum>=26) {
        sum=sum-26;}
        else {sum=0;}
        System.out.println(days);
        System.out.println(sum);
    }
}
