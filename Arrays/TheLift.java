package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        int[] wagonsState = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int currentFreeSpace = 0;
        int[] newState = new int[wagonsState.length];
        int currentPeopleOnBord = 0;
        int freeSpace = 0;

        if (peopleWaiting == 0) {
            newState = wagonsState;
            for (int i = 0; i <= wagonsState.length - 1; i++) {
                int currentWagon = wagonsState[i];
                if (currentWagon < 4) {
                    freeSpace++;
                }
            }
        }

        for (int i = 0; i <= wagonsState.length - 1; i++) {
            int currentWagon = wagonsState[i];
            if (currentWagon < 4) {
                currentFreeSpace = 4 - currentWagon;
                if (peopleWaiting >= currentFreeSpace) {
                    currentPeopleOnBord = currentFreeSpace;

                } else {
                    currentPeopleOnBord = peopleWaiting;
                    freeSpace = currentFreeSpace - peopleWaiting;
                    if (freeSpace < 0) {
                        freeSpace = 0;
                    }
                }

                peopleWaiting -= currentPeopleOnBord;
                if (peopleWaiting < 0) {
                    peopleWaiting = 0;
                }
                if (currentWagon == 0) {
                    newState[i] = currentPeopleOnBord;
                } else {
                    newState[i] = currentPeopleOnBord + currentWagon;
                }

            } else if (currentWagon == 4) {
                newState[i] = currentWagon;
            }
        }


        if (freeSpace > 0 && peopleWaiting == 0) {
            System.out.println("The lift has empty spots!");
            for (int i : newState) {
                System.out.print(i + " ");
            }
        } else if (peopleWaiting > 0 && freeSpace == 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaiting);
            for (int i : newState) {
                System.out.print(i + " ");
            }
        } else if (freeSpace == 0 && peopleWaiting == 0) {
            for (int i : newState) {
                System.out.print(i + " ");
            }
        }
    }
}