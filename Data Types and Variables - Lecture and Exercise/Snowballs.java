package PFDataTypesAndVariables;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte number = Byte.parseByte(scanner.nextLine());
        double value = 0;
        double highestValue = 0;
        int highestSnow=0;
        int highestTime=0;
        int highestQuality=0;
        //(snowballSnow / snowballTime) ^ snowballQuality

        for (int i = 1; i <= number; i++) {
            short snow = Short.parseShort(scanner.nextLine());
            short time = Short.parseShort(scanner.nextLine());
            byte quality = Byte.parseByte(scanner.nextLine());
            value = Math.pow(snow * 1.0 / time, quality);
            if (value > highestValue) {
                highestValue = value;
                highestSnow=snow;
                highestTime=time;
                highestQuality=quality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", highestSnow, highestTime, highestValue, highestQuality);
    }
}
