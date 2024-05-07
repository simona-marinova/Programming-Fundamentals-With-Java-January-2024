package TextProcessing;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     //   String word = scanner.nextLine();
     //   String reverse = "";

      //  while(!word.equals("end")) {
        //    for (int i = word.length()-1; i >= 0 ; i--) {
         //       reverse+=word.charAt(i);
        //    }
         //   System.out.printf("%s = %s%n", word, reverse);
         //   reverse="";

        //    word=scanner.nextLine();
    //    }

String text =scanner.nextLine();

while(!text.equals("end")) {
    StringBuilder reverse = new StringBuilder(text);
    reverse.reverse();
    System.out.printf("%s = %s%n", text, reverse.toString());
    text=scanner.nextLine();

}



    }
}
