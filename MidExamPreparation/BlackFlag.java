package FundamentalsMidExamPreparation;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double additionalPlunder = dailyPlunder*0.50;
        double expectedPlunder = Integer.parseInt(scanner.nextLine());
        double sumPlunder = 0;

        for (int i = 1; i <= days; i++) {
            sumPlunder += dailyPlunder;
            if (i % 3 == 0) {
                sumPlunder += additionalPlunder;
            }
            if(i%5==0) {
                sumPlunder=sumPlunder-0.30*sumPlunder;
            }
        }
        if(sumPlunder>=expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", sumPlunder);
        }
        else {
            System.out.printf("Collected only %.2f%% of the plunder.",sumPlunder/expectedPlunder*100 );
        }
    }
}
