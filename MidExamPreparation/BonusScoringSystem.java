package FundamentalsMidExamPreparation;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStudents = Integer.parseInt(scanner.nextLine());
        int numberLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
        double maxBonus=Double.MIN_VALUE;
        int maxLectures =0;

        for (int i = 1; i <=numberStudents ; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
double bonus = attendance*1.0/numberLectures*(5 + additionalBonus);
if(bonus>maxBonus) {
    maxBonus=bonus;
    maxLectures=attendance;
}
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxLectures);
    }
}
