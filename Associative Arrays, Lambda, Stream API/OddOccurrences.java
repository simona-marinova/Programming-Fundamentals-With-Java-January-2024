package AssociativeArrayLambdaStreamAPI;

import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Map<String, Integer> words = new LinkedHashMap<>();

        for(String word:input) {
            String newWord = word.toLowerCase();
            if(!words.containsKey(newWord)) {
            words.putIfAbsent(newWord, 1);}
            else {
               int value= words.get(newWord);
                words.put(newWord,value+1);
            }

        }
        List <String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> pair: words.entrySet()) {
            int value = pair.getValue();
            String word = pair.getKey();
            if(value%2!=0) {
                list.add(word);
            }
        }
        System.out.print(String.join(", ", list));
    }
}
