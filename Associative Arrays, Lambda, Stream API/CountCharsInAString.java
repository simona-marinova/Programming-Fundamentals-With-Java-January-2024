package AssociativeArrayLambdaStreamAPI;

import java.util.*;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map <Character, Integer> lettersCount = new LinkedHashMap<>();

        for (int i = 0; i <=input.length()-1 ; i++) {
         char currentChar = input.charAt(i);
            if(currentChar!=' ') {
                lettersCount.putIfAbsent(currentChar,0);
                int value= lettersCount.get(currentChar);
                lettersCount.put(currentChar,value+1);
            }
        }


for (Map.Entry<Character,Integer> pair: lettersCount.entrySet()) {
    System.out.printf("%c -> %d%n", pair.getKey(), pair.getValue());
}

    }
}
