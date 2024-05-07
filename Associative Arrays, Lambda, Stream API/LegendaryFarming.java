package AssociativeArrayLambdaStreamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        Map<String, Integer> junk = new LinkedHashMap<>();
        boolean isPurchsed = false;

        while (!isPurchsed) {
            String[] information = scanner.nextLine().split(" ");
            for (int i = 0; i <= information.length - 1; i += 2) {
                int number = Integer.parseInt(information[i]);
                String name = information[i + 1].toLowerCase();
                if (name.equals("shards") || name.equals("fragments") || name.equals("motes")) {
                    int currentNumber = materials.get(name);
                    materials.put(name, number + currentNumber);
                    if (materials.get(name) >= 250) {
                        if (name.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (name.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else if (name.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }
                        currentNumber = materials.get(name);
                        materials.put(name, currentNumber - 250);
                        isPurchsed = true;
                        if (isPurchsed) {
                            break;
                        }
                    }
                } else {
                    if (!junk.containsKey(name)) {
                        junk.put(name, number);
                    } else {
                        int currentNumber = junk.get(name);
                        junk.put(name, number + currentNumber);
                    }
                }
            }
        }
        materials.entrySet().forEach(pair -> System.out.printf("%s: %d%n", pair.getKey(), pair.getValue()));
        junk.entrySet().forEach(pair -> System.out.printf("%s: %d%n", pair.getKey(), pair.getValue()));

    }
}


