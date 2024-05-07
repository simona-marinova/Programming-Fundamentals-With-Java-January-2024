package List;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> distances = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
int sumRemovedElements=0;

        while (!distances.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index < 0) {
                int numberToCopy = distances.get(distances.size() - 1);
                int value=distances.get(0);
                sumRemovedElements+=value;
                distances.remove(0);
                distances.add(0, numberToCopy);
                for (int i = 0; i <= distances.size() - 1; i++) {
                    int currentNumber = distances.get(i);
                    if (currentNumber <= value) {
                        distances.set(i, currentNumber + value);
                    } else {
                        distances.set(i, currentNumber - value);
                    }

                }
            } else if (index > distances.size() - 1) {
                int valueToMove = distances.get(distances.size()-1);
                int value= distances.get(distances.size()-1);
                sumRemovedElements+=value;
                distances.remove(distances.size() - 1);
                distances.add(valueToMove);
                for (int i = 0; i <= distances.size() - 1; i++) {
                    int currentNumber = distances.get(i);
                    if (currentNumber <= value) {
                        distances.set(i, currentNumber + value);
                    } else {
                        distances.set(i, currentNumber - value);
                    }
                }
            } else {
                int value = distances.get(index);
                sumRemovedElements+=value;
                distances.remove(index);
                for (int i = 0; i <= distances.size() - 1; i++) {
                    int currentNumber = distances.get(i);
                    if (currentNumber <= value) {
                        distances.set(i, currentNumber + value);
                    } else {
                        distances.set(i, currentNumber - value);
                    }

                }

            }
        }
        System.out.println(sumRemovedElements);

    }
}
