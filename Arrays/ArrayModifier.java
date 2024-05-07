package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String [] array = scanner.nextLine().split(" ");
        String input = array[0];


        while(!input.equals("end")) {

if(input.equals("swap")) {
    String positionOne = array[1];
    int one = Integer.parseInt(positionOne);
    String positionTwo = array[2];
    int two = Integer.parseInt(positionTwo);
    int firstNumber = numbers[one];
    int secondNumber = numbers[two];
    numbers[one] = secondNumber;
    numbers[two] = firstNumber;

}
else if(input.equals("multiply")) {
    String positionOne = array[1];
    int one = Integer.parseInt(positionOne);
    String positionTwo = array[2];
    int two = Integer.parseInt(positionTwo);
int firstNumber = numbers[one];
int secondNumber = numbers[two];
numbers[one] = firstNumber*secondNumber;
}
else if(input.equals("decrease")) {
    for (int i = 0; i <=numbers.length-1 ; i++) {
        numbers[i] = numbers[i] - 1;
    }

}
                array = scanner.nextLine().split(" ");
            input = array[0];
        }

       for (int i = 0; i <= numbers.length-1 ; i++) {
            if (i<numbers.length-1) {
                System.out.print(numbers[i]+ ", ");
            }
            else if (i==numbers.length-1){
                System.out.print(numbers[i]);
            }
        }



    }
}
