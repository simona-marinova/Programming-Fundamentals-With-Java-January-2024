package PFDataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum=0;
        boolean isFull=false;

        for (int i = 1; i <=n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            sum+=liters;
            if(sum>255) {
                sum=sum-liters;
                System.out.println("Insufficient capacity!" );
            }

        }
        System.out.println(sum);

    }
}
