package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        int sizeOne = firstList.size();
        int sizeTwo = secondList.size();

        if (sizeOne > sizeTwo) {
            for (int i = 0; i <= sizeTwo - 1; i++) {
                int numberToAdd = firstList.get(i);
                result.add(numberToAdd);
                numberToAdd = secondList.get(i);
                result.add(numberToAdd);
            }

            for (int i = sizeTwo; i <= firstList.size() - 1; i++) {
                int numberToAdd = firstList.get(i);
                result.add(numberToAdd);
            }

        } else {
            for (int i = 0; i <= sizeOne - 1; i++) {
                int numberToAdd = firstList.get(i);
                result.add(numberToAdd);
                numberToAdd = secondList.get(i);
                result.add(numberToAdd);
            }

            for (int i = sizeOne; i <= secondList.size() - 1; i++) {
                int numberToAdd = secondList.get(i);
                result.add(numberToAdd);
            }
        }

        for (int number : result) {
            System.out.print(number + " ");
        }
    }
}