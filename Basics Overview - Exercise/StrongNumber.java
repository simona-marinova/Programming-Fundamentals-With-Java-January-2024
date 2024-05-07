package PFBasicOverviewExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String n = number + "";
        int length = n.length();
        int num =1;
        String strong = "";
        int sum=0;

        for (int position = 0; position <length ; position++) {
            char currentDigit = n.charAt(position);
            int digit= Integer.parseInt(currentDigit+"");
            for (int i = digit; i >=1 ; i--) {
                num = num*i;
            }
            sum=sum+num;
            num=1;
        }


if (number==sum) {
    System.out.println("yes");
}
else {
    System.out.println("no");
}
    }
}
