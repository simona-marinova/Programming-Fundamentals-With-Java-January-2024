package FinalExamFundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = scanner.nextLine();
        Map<String, List<String>> heroes = new LinkedHashMap<>();

        while (!commands.equals("End")) {
            String[] instructions = commands.split(" ");
            String instruction = instructions[0];
            String heroName = instructions[1];
            switch (instruction) {
                case "Enroll":
                    if (heroes.containsKey(heroName)) {
                        System.out.printf("%s is already enrolled.\n", heroName);
                    } else {
                        heroes.put(heroName, new ArrayList<>());
                    }
                    break;
                case "Learn":
                    String spellName = instructions[2];
                    if (!heroes.containsKey(heroName)) {
                        System.out.printf("%s doesn't exist.\n", heroName);
                    } else {
                        List<String> list = heroes.get(heroName);
                        if (list.contains(spellName)) {
                            System.out.printf("%s has already learnt %s.\n", heroName, spellName);
                        } else {
                            list.add(spellName);
                        }
                    }
                    break;
                case "Unlearn":
                    spellName = instructions[2];
                    if (!heroes.containsKey(heroName)) {
                        System.out.printf("%s doesn't exist.\n", heroName);
                    } else {
                        List<String> list = heroes.get(heroName);
                        if (list.contains(spellName)) {
                            list.remove(spellName);
                        } else {
                            System.out.printf("%s doesn't know %s.\n", heroName, spellName);
                        }
                    }
                    break;
            }

            commands = scanner.nextLine();
        }

        System.out.println("Heroes:");
        for (Map.Entry<String, List<String>> entry : heroes.entrySet()) {
            //== {name1}: {spell1}, {spell2}, {spelln}
            String name = entry.getKey();
            List <String> list = entry.getValue();
            System.out.printf("== %s: ", name);
            System.out.printf(String.join(", ",list));
            System.out.println();

        }
    }
}
