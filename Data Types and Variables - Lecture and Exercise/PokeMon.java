package PFDataTypesAndVariables;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int currentN = pokePowerN;
        //N-M;count;
        //N стане 50% от първоначалното N = N/Y ако е възможно ако не :

        while (currentN >=distanceM) {
            currentN = currentN - distanceM;
            if (currentN == 0.50 * pokePowerN && exhaustionFactorY!=0) {
                    currentN = currentN / exhaustionFactorY;
                }
            count++;
            }


        System.out.println(currentN);
        System.out.println(count);
    }
}