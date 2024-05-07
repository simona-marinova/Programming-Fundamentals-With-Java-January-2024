package AssociativeArrayLambdaStreamAPI;

import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<Integer>> results = new LinkedHashMap<>();
        Map<String, Integer> submissions = new LinkedHashMap<>();


        while (!input.equals("exam finished")) {
            String username = input.split("-")[0];
            String language = input.split("-")[1];
            if (!language.equals("banned")) {
                int points = Integer.parseInt(input.split("-")[2]);
                results.putIfAbsent(username, new ArrayList<>());
                results.get(username).add(points);
                submissions.putIfAbsent(language, 0);
                int currentSubmissions = submissions.get(language);
                submissions.put(language, currentSubmissions + 1);
            }
            else {
                results.remove(username);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, List<Integer>> entry : results.entrySet()) {
            System.out.printf("%s | ", entry.getKey());
            int maxNumber = entry.getValue().stream().mapToInt(Integer::intValue).max().getAsInt();
            System.out.println(maxNumber);
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : submissions.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }
    }
}