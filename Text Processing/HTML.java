package TextProcessing;

import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title =scanner.nextLine();
        String content = scanner.nextLine();
        String comment = scanner.nextLine();
        System.out.println("<h1>");
        System.out.printf("    %s%n",title);
        System.out.println("</h1>");
        System.out.println("<article>");
        System.out.printf("    %s%n",content);
        System.out.println("</article>");

        while(!comment.equals("end of comments")) {
            System.out.println("<div>");
            System.out.printf("    %s%n",comment);
            System.out.println("</div>");
            comment=scanner.nextLine();
        }



    }
}
