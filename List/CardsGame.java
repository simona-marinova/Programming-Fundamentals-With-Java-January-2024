package List;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
            int firstPlayerCard = firstPlayerCards.get(0);
            int secondPlayerCard = secondPlayerCards.get(0);
            firstPlayerCards.remove(0);
            secondPlayerCards.remove(0);

                if (firstPlayerCard > secondPlayerCard) {
                    firstPlayerCards.add(firstPlayerCard);
                    firstPlayerCards.add(secondPlayerCard);
                } else if (firstPlayerCard<secondPlayerCard) {
                    secondPlayerCards.add(secondPlayerCard);
                    secondPlayerCards.add(firstPlayerCard);
                }
            }

        if (firstPlayerCards.isEmpty()) {
            int sum = getSum(secondPlayerCards);
            System.out.printf("Second player wins! Sum: %d", sum);
        } else  {
            int sum = getSum(firstPlayerCards);
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }

    private static int getSum(List<Integer> firstCards) {
        int sum = 0;
        for (int numbers : firstCards) {
            sum += numbers;
        }
        return sum;
    }
    }