package FundamentalsMidExamPreparation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("Retire")) {
            String[] commands = command.split(" ");
            switch (commands[0]) {
                case "Fire":
                    int index = Integer.parseInt(commands[1]);
                    int damage = Integer.parseInt(commands[2]);
                    boolean isValid = indexValid(index, warShip);
                    if (isValid) {
                        int value = warShip.get(index);
                        warShip.set(index, value - damage);
                        if (warShip.get(index) <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    } else {
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(commands[1]);
                    int endIndex = Integer.parseInt(commands[2]);
                    damage = Integer.parseInt(commands[3]);
                    isValid = indexValid(startIndex, pirateShip);
                    boolean isValidTwo = indexValid(endIndex, pirateShip);
                    if (isValid && isValidTwo) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            int value = pirateShip.get(i);
                            pirateShip.set(i, value - damage);
                            if (pirateShip.get(i) <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    } else {
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Repair":
                    index = Integer.parseInt(commands[1]);
                    int health = Integer.parseInt(commands[2]);
                    isValid = indexValid(index, pirateShip);
                    if (isValid) {
                        int value = pirateShip.get(index);
                        int newValue = value + health;
                        if (newValue > maxHealth) {
                            newValue = maxHealth;
                        }
                        pirateShip.set(index, newValue);
                    } else {
                        command = scanner.nextLine();
                        continue;
                    }
                    break;
                case "Status":
                    double needsRepairValue = 0.20*maxHealth;
                    List<Integer> repairSections = new ArrayList<>();
                    for (int i = 0; i <=pirateShip.size()-1 ; i++) {
                        if(pirateShip.get(i)<needsRepairValue) {
                          repairSections.add(pirateShip.get(i));
                        }
                    }
                    System.out.printf("%d sections need repair.%n", repairSections.size());
                    break;
            }
            command=scanner.nextLine();
        }
int sumPirate = pirateShip.stream().mapToInt(Integer::intValue).sum();
        int warshipSum = warShip.stream().mapToInt(Integer::intValue).sum();
        System.out.printf("Pirate ship status: %d%n", sumPirate);
        System.out.printf("Warship status: %d%n", warshipSum);

    }

    public static boolean indexValid(int index, List<Integer> ship) {
        boolean isValid = false;
        if (index >= 0 && index <= ship.size() - 1) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }
}