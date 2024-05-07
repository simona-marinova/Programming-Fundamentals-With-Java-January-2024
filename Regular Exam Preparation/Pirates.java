package RegularExamFundamentals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> cityPopulation = new LinkedHashMap<>();
        Map<String, Integer> cityGold = new LinkedHashMap<>();

        while (!input.equals("Sail")) {
            //•	You and your crew have targeted cities, with their population and gold, separated by "||".
            String[] text = input.split("\\|\\|");
            String city = text[0];
            int population = Integer.parseInt(text[1]);
            int gold = Integer.parseInt(text[2]);
            if (cityPopulation.containsKey(city)) {
                int currentPopulation = cityPopulation.get(city);
                int currentGold = cityGold.get(city);
                cityPopulation.put(city, currentPopulation + population);
                cityGold.put(city, currentGold + gold);
            } else {
                cityPopulation.put(city, population);
                cityGold.put(city, gold);
            }
            input = scanner.nextLine();
        }

        String inputTwo = scanner.nextLine();

        while (!inputTwo.equals("End")) {
            String[] events = inputTwo.split("\\=\\>");
            String command = events[0];
            String town = events[1];
            switch (command) {
                case "Plunder":
                    int people = Integer.parseInt(events[2]);
                    int gold = Integer.parseInt(events[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, gold, people);
                    int currentPopulation = cityPopulation.get(town);
                    int currentGold = cityGold.get(town);
                    cityPopulation.put(town, currentPopulation - people);
                    cityGold.put(town, currentGold - gold);
                    if (cityPopulation.get(town) == 0 || cityGold.get(town) == 0) {
                        System.out.printf("%s has been wiped off the map!\n", town);
                        cityPopulation.remove(town);
                        cityGold.remove(town);
                    }
                    break;
                case "Prosper":
                    gold = Integer.parseInt(events[2]);
                    if(gold<0) {
                        System.out.println("Gold added cannot be a negative number!");
                        inputTwo=scanner.nextLine();
                        continue;
                    }
                    else {
                        currentGold=cityGold.get(town);
                        cityGold.put(town, currentGold+gold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", gold,town, cityGold.get(town));
                    }
                    break;
            }

            inputTwo = scanner.nextLine();
        }

        if(cityPopulation.size()>0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", cityPopulation.size());
            //{town1} -> Population: {people} citizens, Gold: {gold} kg
            for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()) {
                String town = entry.getKey();
                int population = entry.getValue();
                int gold = cityGold.get(town);
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n", town, population,gold);
            }
        }
        else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
