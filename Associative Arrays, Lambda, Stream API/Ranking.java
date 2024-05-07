package AssociativeArrayLambdaStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> contests = new LinkedHashMap<>();
        TreeMap<String, Map<String, Integer>> users = new TreeMap<>();


        while (!input.equals("end of contests")) {
            String[] data = input.split(":");
            String contest = data[0];
            String password = data[1];
            contests.put(contest, password);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("end of submissions")) {
            String[] dataTwo = input.split("=>");
            String contest = dataTwo[0];
            String password = dataTwo[1];
            String username = dataTwo[2];
            int points = Integer.parseInt(dataTwo[3]);
            boolean isValid = isValid(contest, contests);
            if (isValid) {
                boolean isPasswordCorrect = isCorrect(contest, password, contests);
                if (isPasswordCorrect) {
                    boolean ifExists = exists(username, contest, users);
                    if (ifExists) {
                        int currentPoints = users.get(username).get(contest);
                        if (currentPoints < points) {
                            users.get(username).put(contest, points);
                        }
                    } else {
                        users.putIfAbsent(username, new TreeMap<>());
                        users.get(username).put(contest, points);
                    }
                }
            }
            input = scanner.nextLine();
        }
        int sum =0;
        int maxPoints = Integer.MIN_VALUE;
        String maxName ="";

        for (Map.Entry<String, Map<String, Integer>> entry : users.entrySet()) {
            String name = entry.getKey();
            Map<String, Integer> data = entry.getValue();
            for (Map.Entry<String, Integer> entryTwo : data.entrySet()) {
                int points = entryTwo.getValue();
                sum += points;

            }
            if (sum > maxPoints) {
                maxPoints = sum;
                maxName=name;
            }
            sum = 0;
        }

            System.out.printf("Best candidate is %s with total %d points.%n", maxName, maxPoints);
        System.out.println("Ranking: ");

        for (Map.Entry<String, Map<String, Integer>> entry : users.entrySet()) {
            String name = entry.getKey();
            System.out.printf("%s%n", name);
            Map<String, Integer> data = entry.getValue();
            data=sortByValue(data);
            data.entrySet().stream().forEach(pair -> System.out.printf("#  %s -> %d%n", pair.getKey(), pair.getValue()));

        }
    }

    private static boolean isCorrect(String contest, String password, Map<String, String> contests) {
        String pass = contests.get(contest);
        if (pass.equals(password)) {
            return true;
        }
        return false;
    }

    public static boolean isValid(String contest, Map<String, String> contests) {
        for (Map.Entry<String, String> entry : contests.entrySet()) {
            if (contest.equals(entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    public static boolean exists(String username, String contest, TreeMap<String, Map<String, Integer>> users) {
        for (Map.Entry<String, Map<String, Integer>> entry : users.entrySet()) {
            String currentUserName = entry.getKey();
            Map<String, Integer> information = entry.getValue();
            for (Map.Entry<String, Integer> entryTwo : information.entrySet()) {
                String currentContest = entryTwo.getKey();
                if (currentUserName.equals(username) && currentContest.equals(contest)) {
                    return true;
                }
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
