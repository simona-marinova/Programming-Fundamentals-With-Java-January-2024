package AssociativeArrayLambdaStreamAPI;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> map = new LinkedHashMap<>();


        for (int i = 1; i <= n; i++) {
            String word = scanner.nextLine();
            map.putIfAbsent(word, new ArrayList<>());
            String synonym = scanner.nextLine();
            if (!synonym.equals(word)) {
                map.get(word).add(synonym);
            }
        }

        for (Map.Entry<String, List <String>> pair: map.entrySet()) {
            System.out.println(pair.getKey() +  " " + "-" + " " + String.join(", ", pair.getValue()));
        }
    }
}
