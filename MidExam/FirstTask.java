package FundMidExam;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;


public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
double budget = Double.parseDouble(scanner.nextLine());
int students = Integer.parseInt(scanner.nextLine());
double priceFlour = Double.parseDouble(scanner.nextLine());
double priceEgg = Double.parseDouble(scanner.nextLine());
double priceApron = Double.parseDouble(scanner.nextLine());

//The educational set for one student consists of 1 package of flour, 10 eggs, and an apron.
        double apronAdditionalNumber = Math.ceil(0.2*students);
        //Also, every fifth package of flour is free.
     int freeFlour = students/5;

        double money = (students*priceFlour + students*priceApron + 10*students*priceEgg + apronAdditionalNumber*priceApron)-freeFlour*priceFlour;

       if(money<=budget) {
           System.out.printf("Items purchased for %.2f$.", money);
       }
else {
           System.out.printf("%.2f$ more needed.",money-budget );
       }
    }
}
