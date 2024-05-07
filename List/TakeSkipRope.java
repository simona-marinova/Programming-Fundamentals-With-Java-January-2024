package List;

import java.util.*;
import java.util.stream.Collectors;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<Character> nonNumbers = new ArrayList<>();
        for (int i = 0; i <= text.length() - 1; i++) {
            nonNumbers.add(text.charAt(i));
        }
        List<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i <= nonNumbers.size() - 1; i++) {
            char symbol = nonNumbers.get(i);
            if ((int) symbol >= 48 && (int) symbol <= 57) {
                int number = Integer.parseInt(symbol + "");
                numbersList.add(number);
            }
        }

        for (int i = nonNumbers.size() - 1; i >= 0; i--) {
            char symbol = nonNumbers.get(i);
            if ((int) symbol >= 48 && (int) symbol <= 57) {
                nonNumbers.remove(i);
            }
        }

        List<Integer> takeList = new ArrayList<>(); //even
        List<Integer> skipList = new ArrayList<>(); //odd


        for (int i = 0; i <= numbersList.size() - 1; i++) {
            int currentNumber = numbersList.get(i);
            if (i % 2 == 0) {
                takeList.add(currentNumber);
            } else {
                skipList.add(currentNumber);
            }
        }
        String result = "";
        int startIndex=0;
        int endIndex=0;

        for (int i = 0; i <=takeList.size()-1 ; i++) {
          startIndex=endIndex;
            int takeNumberSymbols = takeList.get(i);
            endIndex = startIndex+takeNumberSymbols;
            if(takeNumberSymbols!=0) {
                for (int j = startIndex; j <Math.min(endIndex,nonNumbers.size()) ; j++) {
                    result=result+nonNumbers.get(j);
                }
            }
            int skipNumberSymbols=skipList.get(i);
            endIndex=endIndex+skipNumberSymbols;
        }

        System.out.println(result);

        }
    }

