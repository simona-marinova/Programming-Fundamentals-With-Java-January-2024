package RegularExamFundamentals;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder password = new StringBuilder(text);
        String command = scanner.nextLine();

        while(!command.equals("Done")) {
            String [] commands= command.split(" ");
            String instruction = commands[0];
            switch(instruction) {
                case "TakeOdd":
                   StringBuilder temporaryPassword=new StringBuilder();
                    for (int i = 1; i <=password.length()-1; i+=2) {
                        char symbol = password.charAt(i);
                        temporaryPassword.append(symbol);
                    }
                    password=temporaryPassword;
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commands[1]);
                    int length = Integer.parseInt(commands[2]);
                    password.delete(index,index+length);
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring  = commands[1];
                    String substitute = commands[2];
                    if(password.toString().contains(substring)){
                        String temporaryPass = password.toString();
                       temporaryPass= temporaryPass.replace(substring,substitute);
                        password=new StringBuilder(temporaryPass);
                        System.out.println(password.toString());
                    }
                    else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            command=scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password.toString());
    }
}
