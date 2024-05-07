package Methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        countVowels(input);
    }

    public static void countVowels (String input){
        int count=0;
        for (int i = 0; i <=input.length()-1 ; i++) {
          char symbol = input.charAt(i);
            boolean isVowel = (int) symbol == 65 || (int) symbol == 69 || (int) symbol == 73 ||
                    (int) symbol == 79 || (int) symbol == 85  || (int) symbol == 97 ||
                    (int) symbol == 101 || (int) symbol == 111 || (int) symbol == 117 || (int) symbol == 105;
            if(isVowel) {
                count++;
            }
        }
        System.out.println(count);

}
}