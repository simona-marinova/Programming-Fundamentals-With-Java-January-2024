package AssociativeArrayLambdaStreamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> registeredUsers = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String[] information = scanner.nextLine().split(" ");
            if (information[0].equals("register")) {
                String name = information[1];
                String number = information[2];
                if (!registeredUsers.containsKey(name)) {
                    registeredUsers.put(name, number);
                    System.out.printf("%s registered %s successfully%n", name, number);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", number);
                }

            }
            else  {
                String name = information[1];
                if(!registeredUsers.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                }
                else {
                    System.out.printf("%s unregistered successfully%n", name);
                    registeredUsers.remove(name);
                }
            }
        }
        registeredUsers.entrySet().stream().forEach(pair -> System.out.printf("%s => %s%n", pair.getKey(), pair.getValue()));
    }

}