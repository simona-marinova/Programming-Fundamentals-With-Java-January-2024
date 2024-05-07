package Arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberDay = Integer.parseInt(scanner.nextLine());

        String[] days = new String[8];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days [3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";
        days[7] = "Invalid day!";

if(numberDay>=1 && numberDay<=7) {
    System.out.println(days[numberDay-1]);
}
else {
    System.out.println("Invalid day!");
}




    }
}
