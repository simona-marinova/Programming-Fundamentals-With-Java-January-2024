package RegularExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String message = scanner.nextLine();
            int count = 0;
            for (int j = 0; j <= message.length() - 1; j++) {
                char symbol = message.charAt(j);
                if (symbol == 's' || symbol == 'S' || symbol == 't' || symbol == 'T' ||
                        symbol == 'a' || symbol == 'A' || symbol == 'R' || symbol == 'r') {
                    count++;
                }
            }
            StringBuilder newMessage = new StringBuilder();
            for (int j = 0; j <= message.length() - 1; j++) {
                char symbol = message.charAt(j);
                int newASCIICode = (int) symbol - count;
                char newSymbol = (char) newASCIICode;
                newMessage.append(newSymbol);
            }
            String regex = "\\@(?<planet>[A-Za-z]+)[^@\\-!:>]*\\:(?<population>\\d+)[^@\\-!:>]*!(?<attack>[AD])\\![^@\\-!:>]*\\-\\>(?<soldierCount>\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(newMessage);
            if (matcher.find()) {
                String planetName = matcher.group("planet");
                String attack = matcher.group("attack");
                if (attack.equals("A")) {
                    attackedPlanets.add(planetName);
                } else {
                    destroyedPlanets.add(planetName);
                }

            }
        }

        Collections.sort(destroyedPlanets);
        Collections.sort(attackedPlanets);
        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        for (String planet : attackedPlanets) {
            System.out.printf("-> %s%n",planet);
        }
        System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        for (String destroyedPlanet : destroyedPlanets) {
            System.out.printf("-> %s%n", destroyedPlanet);
        }
    }
}
