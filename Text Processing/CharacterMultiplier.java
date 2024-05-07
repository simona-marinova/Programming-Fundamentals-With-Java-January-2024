package TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        String input =scanner.nextLine();
        String firstWord = input.split(" ")[0];
        String secondWord = input.split(" ")[1];
        if(firstWord.length()>secondWord.length()) {
            for (int i = 0; i <=secondWord.length()-1 ; i++) {
                char first = firstWord.charAt(i);
                char second = secondWord.charAt(i);
                sum+=first*second;
            }
            for (int j = secondWord.length(); j <=firstWord.length()-1; j++) {
                sum+= firstWord.charAt(j);
            }
        }
        else if(firstWord.length()==secondWord.length()){
            for (int i = 0; i <=secondWord.length()-1 ; i++) {
                char first = firstWord.charAt(i);
                char second = secondWord.charAt(i);
                sum+=first*second;
            }
        }
        else {
            for (int j = 0; j <=firstWord.length()-1 ; j++) {
                char first = firstWord.charAt(j);
                char second = secondWord.charAt(j);
                sum+=first*second;
            }
            for (int i = firstWord.length(); i <=secondWord.length()-1; i++) {
                sum+=secondWord.charAt(i);
            }
        }
        System.out.println(sum);

    }
}
