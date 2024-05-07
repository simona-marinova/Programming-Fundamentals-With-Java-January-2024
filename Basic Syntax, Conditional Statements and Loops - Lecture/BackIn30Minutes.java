package PFBasicsOverview;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        int minutes = hour*60 +minute;
        int timeAfterThirtyMinutes = minutes +30;

        int hourAfter = timeAfterThirtyMinutes/60;
        int minutesAfter = timeAfterThirtyMinutes%60;

        if(hourAfter==24) {hourAfter=0;}

        System.out.printf("%d:%02d", hourAfter, minutesAfter);
    }
}
