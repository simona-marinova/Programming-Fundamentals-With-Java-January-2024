package AssociativeArrayLambdaStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        Map <String, List<Double> > list = new LinkedHashMap<>();

        while(!input.equals("buy")) {
            String [] products = input.split(" ");
            String name = products[0];
            double price = Double.parseDouble(products[1]);
            double quantity = Double.parseDouble(products[2]);
if(!list.containsKey(name)) {
    list.put(name, new ArrayList<>());
    list.get(name).add(price);
    list.get(name).add(quantity);
}
else {
    double currentQuantity = list.get(name).get(1);
    double currentPrice = list.get(name).get(0);
    list.get(name).set(0, price);
    list.get(name).set(1, currentQuantity + quantity);
}
            input=scanner.nextLine();
        }
  for(Map.Entry <String, List<Double>> pair: list.entrySet()) {
       String key = pair.getKey();
       List <Double> products = list.get(key);
       double all = products.get(0)*products.get(1);
      System.out.printf("%s -> %.2f%n", pair.getKey(), all);
   }


    }
}
