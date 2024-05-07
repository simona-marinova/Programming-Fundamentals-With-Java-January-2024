package AssociativeArrayLambdaStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map <String, List <Double>> students = new LinkedHashMap<>();
        Map<String, Double> studentsAverage = new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            String name =scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry: students.entrySet()) {
            List <Double> grades = entry.getValue();
            String key = entry.getKey();
            double sum = grades.stream().mapToDouble(Double::doubleValue).sum();
            double average = sum/grades.size();
            if(average>=4.50) {
               studentsAverage.put(key, average);
            }
        }

studentsAverage.entrySet().forEach(name -> System.out.printf("%s -> %.2f%n",name.getKey(), name.getValue() ));

    }

}
