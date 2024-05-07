package FundamentalsMidExamPreparation;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;
public class ShootForTheWinWithList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
int count=0;
        while(!input.equals("End")) {
            int index = Integer.parseInt(input);
            if(index>=0 && index <=targets.size()-1) {
                int currentTarget = targets.get(index);
                if (currentTarget != -1) {
                    count++;
                    targets.set(index, -1);
                }
                for (int i = 0; i <= targets.size() - 1; i++) {
                    if (targets.get(i) != -1) {
                        int currentNumber = targets.get(i);
                        if (currentNumber > currentTarget) {
                            targets.set(i, currentNumber - currentTarget);
                        } else {
                            targets.set(i, currentNumber + currentTarget);
                        }
                    }
                }

            }
            input=scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", count);
       for(int number:targets) {
           System.out.print(number+ " ");
       }
    }
}
