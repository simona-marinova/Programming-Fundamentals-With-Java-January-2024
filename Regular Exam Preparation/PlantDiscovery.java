package RegularExamFundamentals;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantsRarity = new LinkedHashMap<>();
        Map<String, List<Integer>> plantsRating = new LinkedHashMap<>();


        for (int i = 1; i <= n; i++) {
            String information = scanner.nextLine();
            String[] plantsInfo = information.split("<->");
            String plant = plantsInfo[0];
            int rarity = Integer.parseInt(plantsInfo[1]);
            plantsRarity.put(plant, rarity);
            plantsRating.put(plant, new ArrayList<>());
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String [] inputs = input.split(": ");
            String command = inputs[0];
            String [] plantInt  = inputs[1].split(" - ");
            String plant = plantInt[0];
                if (plantsRarity.containsKey(plant)) {
                    switch (command) {
                        case "Rate":
                            int rating = Integer.parseInt(plantInt[1]);
                            plantsRating.get(plant).add(rating);
                            break;
                        case "Update":
                            int newRarity = Integer.parseInt(plantInt[1]);
                            plantsRarity.put(plant, newRarity);
                            break;
                        case "Reset":
                            plantsRating.put(plant, new ArrayList<>());
                            break;
                    }

                } else {
                    System.out.println("error");
                }
            input = scanner.nextLine();
            }



        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entryRarity : plantsRarity.entrySet()) {
            String name = entryRarity.getKey();
            int rarity = entryRarity.getValue();
            List<Integer> list = plantsRating.get(name);
            int sum = 0;
            for (int i = 0; i <= list.size() - 1; i++) {
                sum += list.get(i);
            }
            double average;
            if (list.size() == 0) {
                average = 0.00;
            } else {
                 average = sum * 1.0 / list.size();
            }
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", name, rarity, average);
        }
    }
}