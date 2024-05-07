package PFDataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = number/capacity;


        if (number%capacity==0) {
            courses=courses;
        } else {
            courses=courses+1;
        }

        System.out.println(courses);
    }
}
