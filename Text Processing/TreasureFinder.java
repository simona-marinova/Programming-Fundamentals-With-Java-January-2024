package TextProcessing;

import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] keys = scanner.nextLine().split(" ");
        String input = scanner.nextLine();
        int keysLength = keys.length;
        StringBuilder newText = new StringBuilder();


        while (!input.equals("find")) {
            for (int i = 0; i <= input.length() - 1; i += keysLength) {
                int endIndex = keysLength + i;
                if (endIndex > input.length() - 1) {
                    endIndex=input.length();
                }
                    String currentText = input.substring(i, endIndex);
                for (int j = 0; j <= keys.length-1; j++) {
                    String currentKey = keys[j];
                    int key = Integer.parseInt(currentKey);
                    char currentSymbol = currentText.charAt(j);
                    int newS = (int) currentSymbol - key;
                    char newSymbol = (char) newS;
                    newText.append(newSymbol);
                    int index = input.lastIndexOf(currentSymbol);
                    if(index==input.length()-1) {
                        break;
                    }
                }
            }
            int start = newText.indexOf("&");
            int end = newText.lastIndexOf("&");
String name = newText.substring(start +1,end);
start = newText.indexOf("<");
end = newText.lastIndexOf(">");
String coordinates = newText.substring(start+1, end);
            System.out.printf("Found %s at %s%n", name, coordinates);
            input = scanner.nextLine();
            newText=new StringBuilder();

        }

        System.out.println(newText);
    }
}
