package FundamentalsMidExamPreparation;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      byte first = Byte.parseByte(scanner.nextLine());
      byte second = Byte.parseByte(scanner.nextLine());
      int third = Byte.parseByte(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int countHours=0;

        int allStudentsAnswerOneHour =first+second+third;

        while(studentsCount>0) {
            countHours++;
            if(countHours%4==0) {continue;}
           studentsCount = studentsCount-allStudentsAnswerOneHour;

        }
        System.out.printf("Time needed: %dh.", countHours);
    }
}
