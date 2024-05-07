package AssociativeArrayLambdaStreamAPI;

import java.util.*;

public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<String, Integer>> users = new LinkedHashMap<>();
        Map <String, Integer> usersPoints = new HashMap<>();

        while (!input.equals("no more time")) {
            String[] data = input.split(" -> ");
            String username = data[0];
            String contest = data[1];
            int points = Integer.parseInt(data[2]);
            boolean contestExists = contestExists(contest, users);
            if (!contestExists) {
                users.put(contest, new TreeMap<>());
                users.get(contest).put(username, points);
                usersPoints.put(username,points);
            } else {
                boolean userExists = userExists(username, users);
                if (!userExists) {
                    users.get(contest).put(username, points);
                    int currentPoints = users.get(contest).get(username);
                    usersPoints.put(username,points+currentPoints);
                } else {
                    int currentPoints = users.get(contest).get(username);
                    if (currentPoints < points) {
                        users.get(contest).put(username, points);
                    }
                    currentPoints = users.get(contest).get(username);
                    usersPoints.put(username,points+currentPoints);
                }
            }

            input = scanner.nextLine();
        }
        int number=1;
        for (Map.Entry<String, Map<String, Integer>> entry : users.entrySet()) {
            String contest = entry.getKey();
            System.out.printf("%s: %d participants%n", contest, entry.getValue().size());
            Map <String, Integer> names = entry.getValue();
            names =sortByValue(names);
            for (Map.Entry<String, Integer> entryTwo : names.entrySet()) {
                String name= entryTwo.getKey();
                int points = entryTwo.getValue();
                System.out.printf("%d. %s <::> %d%n", number, name, points);
                number++;
            }
        }
        System.out.println("Individual standings:");
        usersPoints=sortByValue(usersPoints);
        number =1;
        for (Map.Entry<String, Integer> entry : usersPoints.entrySet()) {
            String user = entry.getKey();
            int points = entry.getValue();
            System.out.printf("%d. %s -> %d%n", number, user, points);
            number++;

        }
    }
        private static boolean userExists (String username, Map < String, Map < String, Integer >> users){
            for (Map.Entry<String, Map<String, Integer>> entry : users.entrySet()) {
                Map<String, Integer> points = entry.getValue();
                for (Map.Entry<String, Integer> entryTwo : points.entrySet()) {
                    String user = entry.getKey();
                    if (user.equals(username)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static boolean contestExists (String contest, Map < String, Map < String, Integer >> users){
            for (Map.Entry<String, Map<String, Integer>> entry : users.entrySet()) {
                if (entry.getKey().equals(contest)) {
                    return true;
                }
            }
            return false;
        }
    public static Map<String, Integer> sortByValue (Map <String, Integer> points) {
        Map<String, Integer> sortedByValue = new LinkedHashMap<>();
        Set<Map.Entry<String, Integer>> entrySet = points.entrySet();
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
        entryList.sort(Comparator.comparing(Map.Entry::getValue));
        Collections.reverse(entryList);
        for (Map.Entry<String, Integer> e : entryList) {
            sortedByValue.put(e.getKey(), e.getValue());
        }
        return sortedByValue;
    }
    }
