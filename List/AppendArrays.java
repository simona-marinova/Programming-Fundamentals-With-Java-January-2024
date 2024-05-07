package List;

import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> elements = Arrays.stream(scanner.nextLine().split( "\\|")).collect(Collectors.toList());

        Collections.reverse(elements);

        String output=elements.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .replaceAll("\\s+", " ")
                .trim();

       System.out.println(output);
        }
    }





