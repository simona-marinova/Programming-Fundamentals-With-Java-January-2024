package AssociativeArrayLambdaStreamAPI;

import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Map<Double, Integer> newMap = new TreeMap<>();

        for (double number : numbers) {
            if (!newMap.containsKey(number)) {
                newMap.put(number, 1);
            } else {
                int currentValue = newMap.get(number);
                newMap.put(number, currentValue + 1);
            }
        }

        for(Map.Entry<Double,Integer> pair: newMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", pair.getKey(), pair.getValue());
        }
    }
}