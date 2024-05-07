package TextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] text = scanner.nextLine().split("\\s+");
        double result = 0;
        double resultTwo=0;
        double sumResult =0;


        for (int i = 0; i <=text.length-1 ; i++) {
            String currentText = text[i];
            char firstLetter = currentText.charAt(0);
            char lastLetter = currentText.charAt(currentText.length()-1);
            String num = currentText.substring(1,currentText.length()-1);
          long number = Long.parseLong(num);
            if(Character.isUpperCase(firstLetter)) {
                int alphabetPosition = (int) firstLetter - 64;
                result=number*1.0/alphabetPosition;
            }
            else {
                int alphabetPosition = (int) firstLetter - 96;
                result = number*alphabetPosition;
            }
            if(Character.isUpperCase(lastLetter)) {
                int alphabetPosition = (int) lastLetter - 64;
resultTwo=result-alphabetPosition;
            }
            else {
                int alphabetPosition = (int) lastLetter - 96;
                resultTwo =result +alphabetPosition;
            }
sumResult+=resultTwo;
        }
        System.out.printf("%.2f",sumResult);
    }
}
