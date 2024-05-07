package FundamentalsMidExamPreparation;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;

public class TheLiftWithList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        List<Integer> wagonsState = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        for (int i = 0; i <= wagonsState.size() - 1; i++) {
            int currentWagon = wagonsState.get(i);
            int maxPeople = 4;
            if (currentWagon < 4) {
                int peopleEntering = maxPeople - currentWagon;
                if (peopleEntering > peopleWaiting) {
                    peopleEntering = peopleWaiting;
                }
                peopleWaiting -= peopleEntering;
                if(peopleWaiting<0) {
                    peopleWaiting=0;
                }

                wagonsState.set(i, currentWagon + peopleEntering);
            } else {
                continue;
            }
        }

if(wagonsState.get(wagonsState.size()-1)<4 && peopleWaiting==0) {
    System.out.println("The lift has empty spots!");
            for (int number:wagonsState) {
                System.out.print(number +" ");
            }
}
else if(wagonsState.get(wagonsState.size()-1)==4 && peopleWaiting>0) {
    System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaiting);
    for (int number:wagonsState) {
        System.out.print(number +" ");
    }
}
else {
    for (int number:wagonsState) {
        System.out.print(number +" ");
    }
}
    }
}
