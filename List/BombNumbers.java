package List;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int specialNumber = numbers[0];
        int power = numbers[1];

        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i) == specialNumber) {
                int elementsToRightPlus= list.size()-i;
                int elementsToLeft= list.size()-elementsToRightPlus;
                if(elementsToLeft<power) {
                    power=elementsToLeft;
                }
                for (int j = 1; j <= power; j++) {
                    list.remove(i - j);

                }
                i -= power;
                power = numbers[1];
                if ((list.size() - 1) - i < power) {
                    power = (list.size() - 1) - i;
                }
                for (int j = 1; j <= power; j++) {
                    list.remove(i + j);
                    i--;
                }
                i+=power;
                list.remove(i);
            }

        }
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        System.out.println(sum);
    }
}



