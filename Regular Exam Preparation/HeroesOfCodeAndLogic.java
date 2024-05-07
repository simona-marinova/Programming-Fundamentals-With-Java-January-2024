package RegularExamFundamentals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> heroesHitPoints = new LinkedHashMap<>();
        Map<String, Integer> heroesManaPoints = new LinkedHashMap<>();


        for (int i = 1; i <= n; i++) {
            String[] heroes = scanner.nextLine().split("\\s+");
            String heroName = heroes[0];
            int hitPoints = Integer.parseInt(heroes[1]);
            int manaPoints = Integer.parseInt(heroes[2]);
            if (hitPoints <= 100) {
                heroesHitPoints.put(heroName, hitPoints);
            }
            if (manaPoints <= 200) {
                heroesManaPoints.put(heroName, manaPoints);
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commands = input.split("[ ][\\-][ ]");
            String command = commands[0];
            String heroName = commands[1];
            switch (command) {
                case "CastSpell":
                    int neededManaPoints = Integer.parseInt(commands[2]);
                    String spellName = commands[3];
                    if (heroesManaPoints.get(heroName) >= neededManaPoints) {
                        int currentManaPoints = heroesManaPoints.get(heroName);
                        heroesManaPoints.put(heroName, currentManaPoints - neededManaPoints);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n", heroName, spellName,
                                heroesManaPoints.get(heroName));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commands[2]);
                    String attacker = commands[3];
                    int currentHitPoints = heroesHitPoints.get(heroName);
                    heroesHitPoints.put(heroName, currentHitPoints - damage);
                    currentHitPoints = heroesHitPoints.get(heroName);
                    if (currentHitPoints > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", heroName,
                                damage, attacker, currentHitPoints);
                    } else {
                        heroesHitPoints.remove(heroName);
                        heroesManaPoints.remove(heroName);
                        System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(commands[2]);
                    int currentManaPoints = heroesManaPoints.get(heroName);
                    int newManaPoints = currentManaPoints + amount;
                    if (newManaPoints > 200) {
                        newManaPoints = 200;
                    }
                    heroesManaPoints.put(heroName, newManaPoints);
                    System.out.printf("%s recharged for %d MP!\n", heroName, newManaPoints - currentManaPoints);
                    break;
                case "Heal":
                    amount = Integer.parseInt(commands[2]);
                    currentHitPoints = heroesHitPoints.get(heroName);
                    int newHitPoints = currentHitPoints + amount;
                    if (newHitPoints > 100) {
                        newHitPoints = 100;
                    }
                    heroesHitPoints.put(heroName, newHitPoints);
                    System.out.printf("%s healed for %d HP!\n", heroName, newHitPoints - currentHitPoints);
                    break;
            }

            input = scanner.nextLine();
        }


        for (Map.Entry<String, Integer> entryHit : heroesHitPoints.entrySet()) {
            System.out.printf("%s\n", entryHit.getKey());
            System.out.printf("  HP: %d\n", entryHit.getValue());
            System.out.printf("  MP: %d\n", heroesManaPoints.get(entryHit.getKey()));
        }
    }
}
