package List;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int count=0;
        String indexes = scanner.nextLine();

        while(!indexes.equals("end")) {
           String [] input = indexes.split(" ");
            int indexOne = Integer.parseInt(input[0]);
            int indexTwo = Integer.parseInt(input[1]);
            count++;
            if(indexOne==indexTwo ||indexOne<0 || indexOne>items.size()-1 || indexTwo<0 || indexTwo>items.size()-1) {
                items.add(items.size()/2, "-" +count+ "a");
                items.add(items.size()/2,"-" +count+ "a");
                System.out.println("Invalid input! Adding additional elements to the board");
            }
            else {
                if(items.get(indexOne).equals(items.get(indexTwo))) {
                    String element = items.get(indexOne);
                    String oneToRemove = items.get(indexOne);
                    String twoToRemove = items.get(indexTwo);
                    items.remove(oneToRemove);
                    items.remove(twoToRemove);
                    System.out.printf("Congrats! You have found matching elements - %s!%n", element);
                }
                else {
                    System.out.println("Try again!");
                }
            }
if(items.isEmpty()) {
    System.out.printf("You have won in %d turns!%n", count);
    return;
}

            indexes=scanner.nextLine();
        }
        System.out.println("Sorry you lose :(");
        for (String item:items) {
            System.out.print(item+ " ");
        }


    }
}
