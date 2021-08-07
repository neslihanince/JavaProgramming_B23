package Day15_String;

import java.util.Scanner;

public class NameFormatting {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");

        String firstName = scan.nextLine().trim();
         firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println(firstName);

        System.out.println("Enter your last name");
        String lastName = scan.nextLine().trim();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(lastName);

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);




    }
}
