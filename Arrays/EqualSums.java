package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int leftSum = 0;
        int rightSum = 0;

        if(numbers.length ==1) {
            System.out.println(0);
        }
        boolean exist = false;


        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            for (int position =0; position < i; position++) {
                leftSum += numbers[position];
            }
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                rightSum += numbers[j];
            }

            if (leftSum == rightSum && numbers.length!=1) {
                System.out.println(i);
                exist=true;
            }
            leftSum = 0;
            rightSum = 0;
        }

        if(!exist && numbers.length !=1) {System.out.println("no");}
    }
}