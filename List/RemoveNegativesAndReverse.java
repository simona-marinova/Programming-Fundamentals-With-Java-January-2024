package List;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i <= numbers.size() - 1; i++) {
         int currentNumber =numbers.get(i);
            if (currentNumber < 0) {
                numbers.remove(i);
                i--;
            }
        }
        Collections.reverse(numbers);
        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            for (int number:numbers) {
                System.out.print(number+ " ");
            }
        }
    }
}
