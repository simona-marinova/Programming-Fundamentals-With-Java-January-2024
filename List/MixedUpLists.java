package List;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();

        int positionListOne = 0;
        int positionListTwo = listTwo.size() - 1;
        for (int i = 0; i < Math.min(listOne.size(), listTwo.size()); i++) {
            result.add(listOne.get(positionListOne));
            result.add(listTwo.get(positionListTwo));
            positionListOne++;
            positionListTwo--;
        }
        List<Integer> range = new ArrayList<>();
        if (listOne.size() > listTwo.size()) {
            range = listOne.subList(listOne.size() - 2, listOne.size());
        } else {
            range = listTwo.subList(0, 2);
        }
        Collections.sort(range);
        List<Integer> newResult = new ArrayList<>();
        for (int i = 0; i <= result.size() - 1; i++) {
            int number = result.get(i);
            if (number > range.get(0) && number < range.get(1)) {
                newResult.add(number);
            }
        }
        Collections.sort(newResult);
        for (int num : newResult) {
            System.out.print(num + " ");
        }
    }
}

