package RegularExamFundamentals;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        String instruction = scanner.nextLine();
        StringBuilder decryptedMessage = new StringBuilder(encryptedMessage);
        int length = decryptedMessage.length();

        while(!instruction.equals("Decode")){
String [] instructions = instruction.split("\\|");
String command = instructions[0];
switch(command){
    case "Move":
        int numberOfLetters = Integer.parseInt(instructions[1]);
    String toMove = decryptedMessage.substring(0, numberOfLetters);
    decryptedMessage.delete(0, numberOfLetters);
        decryptedMessage.append(toMove);
        break;
    case "Insert":
        int index = Integer.parseInt(instructions[1]);
        String value = instructions[2];
         int endIndex = value.length() + index-1;
decryptedMessage.insert(index, value);
        break;
    case "ChangeAll":
        String substring = instructions[1];
        String replacement = instructions[2];
String message = String.valueOf(decryptedMessage);
message = message.replace(substring,replacement);
decryptedMessage = new StringBuilder(message);
        break;

}
            instruction=scanner.nextLine();
}
        System.out.printf("The decrypted message is: %s", decryptedMessage.toString());

    }
}
