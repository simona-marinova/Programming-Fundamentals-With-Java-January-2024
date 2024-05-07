package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int numberOne = Integer.parseInt(scanner.nextLine());
                int numberTwo = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(numberOne,numberTwo));
                break;
            case "char":
                char symbolOne = scanner.nextLine().charAt(0);
                char symbolTwo = scanner.nextLine().charAt(0);
                System.out.println(getMax(symbolOne,symbolTwo));
                break;
            case "string":
                String textOne=scanner.nextLine();
                String textTwo =scanner.nextLine();
                System.out.println(getMax(textOne,textTwo));
                break;
        }


    }

    public static int getMax (int numberOne, int numberTwo) {
        int max=0;
        if(numberOne>numberTwo) {
            max=numberOne;
        }
        else {max=numberTwo;}
        return max;
    }

    public static char getMax (char symbolOne, char symbolTwo) {
        char max = '\0';
        if(symbolOne>symbolTwo) {
            max = symbolOne;
        }
        else { max = symbolTwo;}
        return max;
    }

    public static String getMax (String textOne, String textTwo) {
      String max="";
        if(textOne.compareTo(textTwo)>=1) {
            max=textOne;
        }
        else {
            max=textTwo;
        }
        return max;
    }
}
