package List;

import java.util.*;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSetInitial = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> drumSet = new ArrayList<>();
        for (int i = 0; i <= drumSetInitial.size() - 1; i++) {
            drumSet.add(drumSetInitial.get(i));
        }

        String input = scanner.nextLine();
        double price = 0;

        while (!input.equals("Hit it again, Gabsy!")) {
            int hitPower = Integer.parseInt(input);
            for (int i = 0; i <= drumSet.size() - 1; i++) {
                int currentValue = drumSet.get(i);
                drumSet.set(i, currentValue - hitPower);
                int newValue = drumSet.get(i);
                if (newValue <= 0) {
                    price = drumSetInitial.get(i) * 3;
                    if (money >= price) {
                        money -= price;
                        drumSet.set(i, drumSetInitial.get(i));
                    } else {
                        drumSet.remove(i);
                        drumSetInitial.remove(i);
                        i--;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int number : drumSet) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", money);
    }
}

