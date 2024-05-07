package FundamentalsMidExamPreparation;

import java.util.Scanner;
import java.util.Arrays;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        int shoots = 0;
        boolean isShot = false;

        while (!input.equals("End")) {
            int index = Integer.parseInt(input);
            if (index >= 0 && index <= numbers.length - 1) {
                shoots++;
                int number = numbers[index];
                numbers[index] = -1;
                for (int i = 0; i <= numbers.length - 1; i++) {
                    boolean isNotShot = i != index && numbers[i] != -1;
                    if (isNotShot) {
                        if (numbers[i] <= number) {
                            numbers[i] = numbers[i] + number;
                        } else {
                            numbers[i] = numbers[i] - number;
                        }
                    } else {
                        continue;
                    }
                }
            }
            input = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", shoots);
        for (int current: numbers) {
            System.out.print(current + " ");

        }
    }
}