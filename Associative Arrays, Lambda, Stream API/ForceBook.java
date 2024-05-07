package AssociativeArrayLambdaStreamAPI;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        Map<String, List<String>> forceBook = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String[] information = input.split(" \\| ");
                String side = information[0];
                String user = information[1];
                if (!forceBook.containsKey(side)) {
                    forceBook.put(side, new ArrayList<>());

                }
                boolean exists = exists(forceBook, user);
                if (!exists) {
                    List<String> list = forceBook.get(side);
                    list.add(user);
                }
            } else if (input.contains("->")) {
                String[] information = input.split(" -> ");
                String side = information[1];
                String user = information[0];
                boolean exists = exists(forceBook, user);
                if (exists) {
                    for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
                        List<String> users = entry.getValue();
                            users.remove(user);
                    }
                    List<String> list = forceBook.get(side);
                    list.add(user);
                    System.out.printf("%s joins the %s side!%n", user, side);
                }
                else if (!forceBook.containsKey(side)) {
                    forceBook.put(side, new ArrayList<>());
                    forceBook.get(side).add(user);
                    System.out.printf("%s joins the %s side!%n", user, side);
                }
                else {
                    forceBook.get(side).add(user);
                    System.out.printf("%s joins the %s side!%n", user, side);
                }

            }
            input = scanner.nextLine();

        }

        for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                for (String name : entry.getValue()) {
                    System.out.printf("! %s%n", name);
                }
            }
        }
    }

    private static boolean exists (Map<String, List<String>> forceBook, String user) {
        boolean noSuchUser = false;
        for (Map.Entry<String, List<String>> entry : forceBook.entrySet()) {
            List<String> users = entry.getValue();
            if (users.contains(user)) {
                noSuchUser = true;
                break;
            }
        }
        return noSuchUser;
    }
}





