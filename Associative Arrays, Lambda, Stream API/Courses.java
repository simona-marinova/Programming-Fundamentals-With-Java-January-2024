package AssociativeArrayLambdaStreamAPI;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String[] information = input.split(" : ");
            String course = information[0];
            String student = information[1];
            courses.putIfAbsent(course, new ArrayList<>());
            courses.get(course).add(student);
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            String nameOfCourse = entry.getKey();
            int countOfStudents = courses.get(nameOfCourse).size();
            System.out.printf("%s: %d%n", nameOfCourse, countOfStudents);
            for (int i = 0; i <= countOfStudents - 1; i++) {
                String nameOfStudent = courses.get(nameOfCourse).get(i);
                System.out.printf("-- %s%n", nameOfStudent);
            }
        }

    }
}
