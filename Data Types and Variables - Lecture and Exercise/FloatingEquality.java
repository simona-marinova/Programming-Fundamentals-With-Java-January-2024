package PFDataTypesAndVariables;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOne = Double.parseDouble(scanner.nextLine());
        double numberTwo = Double.parseDouble(scanner.nextLine());

       double difference =0;
      if(numberOne>numberTwo) {difference=numberOne-numberTwo;}
      else {difference=numberTwo-numberOne;}

      if (difference>0.000001) {
          System.out.println("False");
      }
      else if(difference<=0.000001) {
          System.out.println("True");
      }
    }
}
