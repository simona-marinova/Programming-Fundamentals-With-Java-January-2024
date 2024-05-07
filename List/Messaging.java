package List;

import java.util.*;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String text = scanner.nextLine();
        List<Character> symbols = new ArrayList<>();
        for (int i = 0; i <= text.length() - 1; i++) {
            char currentSymbol = text.charAt(i);
            symbols.add(currentSymbol);
        }
        List <Character> newList = new ArrayList<>();;

        for (int i = 0; i <= numbers.size() - 1; i++) {
            int sum = 0;
            int currentNumber = numbers.get(i);
            while (currentNumber > 0) {
                int digit = currentNumber % 10;
                sum += digit;
                currentNumber = currentNumber / 10;
            }
            int index = sum;
            if (index <= symbols.size() - 1) {
                char symbol = symbols.get(index);
                newList.add(symbols.get(index));
                symbols.remove(index);
            } else if (index > symbols.size()-1) {
                while (index > symbols.size()-1) {
                    index = index - symbols.size();
                }
                newList.add(symbols.get(index));
                symbols.remove(index);
            }

        }
       for (char symbol:newList) {
           System.out.print(symbol);
       }
    }
}