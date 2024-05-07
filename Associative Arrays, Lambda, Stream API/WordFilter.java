package AssociativeArrayLambdaStreamAPI;

import java.util.Scanner;
import java.util.Arrays;


public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String [] words = scanner.nextLine().split(" ");


String [] newWords = Arrays.stream(words)
        .filter(word -> word.length()%2==0)
        .toArray(String[]::new);

     Arrays.stream(newWords).forEach(word -> System.out.println(word));



    }
}
