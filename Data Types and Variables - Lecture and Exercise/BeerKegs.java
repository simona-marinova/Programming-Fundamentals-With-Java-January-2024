package PFDataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());
        double volume = 0;
        double maxVolume = Double.MIN_VALUE;
        String maxModel="";
//π * r^2 * h.

        for (int i = 1; i <= n; i++) {
            String model = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            volume = Math.PI * radius * radius * height;
            if (volume > maxVolume) {
                maxVolume = volume;
                maxModel=model;
            }
        }
        System.out.println(maxModel);
    }
}
