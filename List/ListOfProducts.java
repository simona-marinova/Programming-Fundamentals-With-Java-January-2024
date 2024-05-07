package List;
import java.util.*;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());
        List <String> list = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String product =scanner.nextLine();
            list.add(i, product);
        }

        Collections.sort(list);
        int i=1;

        for (String product:list) {
            System.out.print(i + "." + product + " ");
            System.out.println();
            i++;

        }
    }
}
