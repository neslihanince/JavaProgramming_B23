package Day15_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        char f = scan.next().charAt(0);

        System.out.println("Enter your last name: ");
        char l = scan.next().charAt(0);
        scan.close();

        String initial = f+"." + l;





    }
}
