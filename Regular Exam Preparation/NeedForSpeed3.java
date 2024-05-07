package RegularExamFundamentals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> carsMileage = new LinkedHashMap<>();
        Map<String, Integer> carsFuel = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            //"{car}|{mileage}|{fuel}"
            String input = scanner.nextLine();
            String[] information = input.split("\\|");
            String car = information[0];
            int mileage = Integer.parseInt(information[1]);
            int fuel = Integer.parseInt(information[2]);
            carsMileage.put(car, mileage);
            carsFuel.put(car, fuel);
        }
        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] commands = command.split(" : ");
            String instruction = commands[0];
            String car = commands[1];
            switch (instruction) {
                case "Drive":
                    int distance = Integer.parseInt(commands[2]);
                    int fuel = Integer.parseInt(commands[3]);
                    int currentFuel = carsFuel.get(car);
                    if (currentFuel >= fuel) {
                        int currentMileage = carsMileage.get(car);
                        carsMileage.put(car, currentMileage + distance);
                        carsFuel.put(car, currentFuel - fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n",
                                car, distance,fuel);
                     currentMileage = carsMileage.get(car);
                     if(currentMileage>=100000) {
                         carsMileage.remove(car);
                         carsFuel.remove(car);
                         System.out.printf("Time to sell the %s!\n", car);
                     }

                    }
                    else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
                    fuel = Integer.parseInt(commands[2]);
                     currentFuel = carsFuel.get(car);
                     int newFuel = currentFuel+fuel;
                     if(newFuel>75) {
                         newFuel=75;
                     }
                     carsFuel.put(car, newFuel);
                    System.out.printf("%s refueled with %d liters\n", car, newFuel-currentFuel);
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(commands[2]);
                    int currentMileage = carsMileage.get(car);
                    int decreasedMileage = currentMileage-kilometers;
                if(decreasedMileage<10000) {
decreasedMileage=10000;
                }
                else {
                    System.out.printf("%s mileage decreased by %d kilometers\n", car,kilometers);
                }
                    carsMileage.put(car, decreasedMileage);
                    break;
            }

            command = scanner.nextLine();
        }

        //"{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."

        for (Map.Entry<String, Integer> entryMileage : carsMileage.entrySet()) {
            String car = entryMileage.getKey();
            int mileage = entryMileage.getValue();
            int fuel = carsFuel.get(car);
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n", car,mileage, fuel );
        }

    }
}
