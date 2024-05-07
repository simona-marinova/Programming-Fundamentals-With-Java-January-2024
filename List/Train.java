package List;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while(!input.equals("end")) {
            if(input.contains("Add")) {
                String [] commands = input.split(" ");
                int numberPassengers = Integer.parseInt(commands[1]);
                wagons.add(numberPassengers);
            }
            else {
                int number = Integer.parseInt(input);
                for (int i = 0; i <=wagons.size()-1 ; i++) {
                    if(number + wagons.get(i)<=maxCapacity) {
                        wagons.set(i, number+ wagons.get(i));
                        break;
                    }
                }
            }


            input=scanner.nextLine();
        }

for (int number:wagons) {
    System.out.print(number+ " ");
}

    }
}
