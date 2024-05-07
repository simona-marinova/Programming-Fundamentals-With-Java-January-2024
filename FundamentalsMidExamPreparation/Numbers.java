package FundamentalsMidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
       double average = sum*1.0/numbers.size();

       List<Integer> newList = new ArrayList<>(5);

        for (int i = 0; i <=numbers.size()-1 ; i++) {
            if(numbers.get(i)>average) {{
newList.add(numbers.get(i));}
            }
        }

        Collections.sort(newList);
        Collections.reverse(newList);

if(newList.isEmpty()) {
    System.out.println("No");
}
else {
    int max = 0;
    if(newList.size()<5) {
        max=newList.size()-1;
    }
    else {
        max=4;
    }
    for (int i = 0; i <=max ; i++) {
        int number=newList.get(i);
        System.out.print(number+ " ");
    }

}
    }
}
