package RegularExamFundamentals;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //It will consist of letters and numbers only.
        String instructions = scanner.nextLine();

        while (!instructions.equals("Generate")) {
            String[] instruction = instructions.split(">>>");
            String command = instruction[0];
            switch (command) {
                case "Contains":
                    String substring = instruction[1];
                    if(text.contains(substring)) {
                        System.out.printf("%s contains %s\n",text, substring);
                }
                    else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = instruction[1];
                    int startIndex = Integer.parseInt(instruction[2]);
                    int endIndex = Integer.parseInt(instruction[3]);
                    substring = text.substring(startIndex,endIndex);
                    if(upperOrLower.equals("Upper")){
                        String newSubstring = substring.toUpperCase();
                        text = text.replace(substring, newSubstring);
                        System.out.println(text);

                    }
                    else {
                        String newSubstring = substring.toLowerCase();
                        text = text.replace(substring, newSubstring);
                        System.out.println(text);
                    }
                    break;
                case"Slice":
                     startIndex = Integer.parseInt(instruction[1]);
                     endIndex = Integer.parseInt(instruction[2]);
                     substring = text.substring(startIndex,endIndex);
                     text = text.replace(substring, "");
                    System.out.println(text);
                    break;

            }
            instructions = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s",text );
    }
}
