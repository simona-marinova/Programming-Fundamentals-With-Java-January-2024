package AssociativeArrayLambdaStreamAPI;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> company = new LinkedHashMap<>();

        while(!input.equals("End")) {
            String [] information = input.split(" -> ");
            String nameOfCompany = information[0];
            String id = information[1];
            company.putIfAbsent(nameOfCompany,new ArrayList<>());
            List <String> list = company.get(nameOfCompany);
            if(!list.contains(id)) {
                list.add(id);
            }
            input=scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : company.entrySet()) {
            System.out.println(entry.getKey());
            List <String> list = entry.getValue();
            for(String name:list) {
                System.out.printf("-- %s%n", name);
            }
        }

    }
}
