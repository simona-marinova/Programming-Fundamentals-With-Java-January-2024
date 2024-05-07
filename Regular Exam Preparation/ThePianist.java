package RegularExamFundamentals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> composers = new LinkedHashMap<>();
        Map<String, String> keys = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            //"{piece}|{composer}|{key}".
            String input = scanner.nextLine();
            String[] info = input.split("\\|");
            String piece = info[0];
            String composer = info[1];
            String key = info[2];
            composers.put(piece,composer);
            keys.put(piece,key);
        }

        String commands = scanner.nextLine();

        while(!commands.equals("Stop")){
            String [] instructions =  commands.split("\\|");
            String command = instructions[0];
            String piece = instructions[1];
            switch(command) {
                case "Add":
                    String composer = instructions[2];
                    String key = instructions[3];
                    if(composers.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!\n", piece);
                    }
                    else {
                        composers.put(piece, composer);
                        keys.put(piece,key);
                        System.out.printf("%s by %s in %s added to the collection!\n", piece, composer, key);
                    }
                    break;
                case "Remove":
                    if(composers.containsKey(piece)){
                        composers.remove(piece);
                        keys.remove(piece);
                        System.out.printf("Successfully removed %s!\n", piece);
                    }
                    else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = instructions[2];
                    if(keys.containsKey(piece)){
                        keys.put(piece,newKey);
                        System.out.printf("Changed the key of %s to %s!\n", piece, newKey);
                    }
                    else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
                    }
                    break;
            }
            commands=scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : composers.entrySet()) {
            String piece = entry.getKey();
            String composer = entry.getValue();
            String key = keys.get(piece);
            System.out.printf("%s -> Composer: %s, Key: %s\n",piece, composer,key);
        }
    }
}
