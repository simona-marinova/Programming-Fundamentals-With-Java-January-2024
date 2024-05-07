package FundamentalsMidExamPreparation;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int energy= Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int countWonBattles = 0;

        while (!input.equals("End of battle")) {
             int distance = Integer.parseInt(input);
            if (energy >= distance) {
                countWonBattles++;
                energy -= distance;
                if(countWonBattles%3==0) {
                    energy+=countWonBattles;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countWonBattles, energy);
                return;
            }
            input = scanner.nextLine();

        }
        System.out.printf("Won battles: %d. Energy left: %d", countWonBattles, energy  );
    }
}
