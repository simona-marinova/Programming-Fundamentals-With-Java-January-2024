package List;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;
public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> carRace = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


int finishLine = carRace.size()/2 +1;

double timeLeftCar =0;

        for (int i = 0; i <finishLine-1 ; i++) {
int currentTime = carRace.get(i);
timeLeftCar+=currentTime;
if(currentTime==0) {
    timeLeftCar=timeLeftCar-0.2*timeLeftCar;
}
        }
double timeRightCar =0;

        for (int j = carRace.size()-1; j >finishLine-1; j--) {
            int currentTime = carRace.get(j);
            timeRightCar+=currentTime;
            if(currentTime==0) {
                timeRightCar=timeRightCar-0.2*timeRightCar;
            }
        }
if(timeLeftCar<timeRightCar) {
    System.out.printf("The winner is left with total time: %.1f", timeLeftCar);
}
else {
    System.out.printf("The winner is right with total time: %.1f", timeRightCar);
}

    }
}
