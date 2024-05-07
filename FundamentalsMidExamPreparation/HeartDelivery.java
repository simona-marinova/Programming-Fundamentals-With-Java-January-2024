package FundamentalsMidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> neighbourhood = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        int currentIndex = 0;

        while (!command.equals("Love!")) {
            String[] commands = command.split(" ");
            int length = Integer.parseInt(commands[1]);
            currentIndex = currentIndex + length;
            if (currentIndex < 0 || currentIndex > neighbourhood.size() - 1) {
                currentIndex = 0;
            }
            int valueToReduce = neighbourhood.get(currentIndex);
            if (valueToReduce == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            }
            if (valueToReduce - 2 == 0) {
                System.out.printf("Place %d has Valentine's day.%n", currentIndex);
            }
            neighbourhood.set(currentIndex, valueToReduce - 2);
            if(neighbourhood.get(currentIndex)<0) {
                neighbourhood.set(currentIndex,0);
            }

            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);

        boolean allZero = neighbourhood.stream().allMatch(n -> n == 0);
        if(allZero) {
            System.out.println("Mission was successful.");
        }
        else {
            List<Integer> nonZeroPositions = new ArrayList<>();
            for (int i = 0; i <=neighbourhood.size()-1 ; i++) {
                if(neighbourhood.get(i)!=0) {
                    nonZeroPositions.add(i);
                }

            }
            System.out.printf("Cupid has failed %d places.", nonZeroPositions.size());
        }

    }

}

