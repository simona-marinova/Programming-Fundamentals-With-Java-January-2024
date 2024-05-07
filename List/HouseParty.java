package List;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
       List<String> guests = new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            String command =scanner.nextLine();
            if(command.contains("is going")) {
                String [] commands =  command.split(" ");
                String currentGuest = commands[0];
                if(guests.contains(currentGuest)) {
                    System.out.printf("%s is already in the list!%n", currentGuest);
                }
                else {
                    guests.add(currentGuest);
                }

            }
            else {
                String [] commands =  command.split(" ");
                String currentGuest = commands[0];
                if(guests.contains(currentGuest)) {
                    guests.remove(currentGuest);
                }
                else {
                    System.out.printf("%s is not in the list!%n", currentGuest);
                }
            }
        }

        for (String name:guests) {
            System.out.println(name);
        }
    }
}
