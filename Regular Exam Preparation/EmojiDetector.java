package RegularExamFundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "([:]{2}|[*]{2})(?<name>[A-Z][a-z]{2,})\\1";
      int coolness = 0;
 long coolThreshold = 1;
 int count =0;
        String text = scanner.nextLine();
        for (int i = 0; i <=text.length()-1 ; i++) {
            char currentSymbol = text.charAt(i);
            if(Character.isDigit(currentSymbol)){
               int num = Integer.parseInt(currentSymbol+"");
                coolThreshold=coolThreshold*num;
            }
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> emojiList = new ArrayList<>();

        while(matcher.find()){
            count++;
            String nameOfEmoji = matcher.group("name");
            String fullName = matcher.group();
            for (int i = 0; i <=nameOfEmoji.length()-1 ; i++) {
                int asciiValue = (int) nameOfEmoji.charAt(i);
              coolness+=asciiValue;
            }
            if(coolness>coolThreshold){
                emojiList.add(fullName);
            }
            coolness=0;
        }

        System.out.printf("Cool threshold: %s\n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:\n", count);
        for (String name : emojiList) {
            System.out.println(name);
        }
    }
}
