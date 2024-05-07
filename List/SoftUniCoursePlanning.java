package List;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> course = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] commands = input.split(":");
            String command = commands[0];
            String lesson = commands[1];
            switch (command) {
                case "Add":
                    if (!course.contains(lesson)) {
                        course.add(lesson);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commands[2]);
                    if (!course.contains(lesson)) {
                        course.add(index, lesson);
                    }
                    break;
                case "Remove":
                    course.remove(lesson);
                    course.remove(lesson + "-Exercise");
                    break;
                case "Swap":
                    String lessonTwo = commands[2];
                    if (course.contains(lesson) && course.contains(lessonTwo)) {
                        int indexOne = course.indexOf(lesson);
                        int indexTwo = course.indexOf(lessonTwo);
                        course.set(indexOne, lessonTwo);
                        course.set(indexTwo, lesson);
                        if (course.contains(lessonTwo + "-Exercise")) {
                            course.remove(lessonTwo + "-Exercise");
                            indexTwo = course.indexOf(lessonTwo);
                            course.add(indexTwo + 1, lessonTwo + "-Exercise");
                        }
                        if (course.contains(lesson + "-Exercise")) {
                            course.remove(lesson + "-Exercise");
                            index = course.indexOf(lesson);
                            course.add(index + 1, lesson + "-Exercise");
                        }
                    } else {
                        input = scanner.nextLine();
                        continue;
                    }
            break;
            case "Exercise":
                if (course.contains(lesson) && !course.contains(lesson + "-Exercise")) {
                    index = course.indexOf(lesson);
                    course.add(index + 1, lesson + "-Exercise");
                } else {
                    course.add(lesson);
                    course.add(lesson + "-Exercise");
                }
                break;
        }

        input = scanner.nextLine();
    }

    int number = 1;
        for(
    int i = 0;
    i <=course.size()-1;i++)

    {
        String currentLesson = course.get(i);
        System.out.println(number + "." + currentLesson);
        number++;
    }
}
}
