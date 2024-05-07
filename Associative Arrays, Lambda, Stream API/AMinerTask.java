package AssociativeArrayLambdaStreamAPI;

import java.util.*;


public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resourse = scanner.nextLine();
        Map<String, Integer> mine = new LinkedHashMap<>();

        while (!resourse.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            mine.putIfAbsent(resourse, 0);
            int value = mine.get(resourse);
            mine.put(resourse, value + quantity);
            resourse = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> pair : mine.entrySet()) {
            System.out.printf("%s -> %d%n", pair.getKey(), pair.getValue());
        }
    }
}
