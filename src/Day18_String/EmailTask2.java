package Day18_String;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email:");

        String email = scan.next();

        int indexOf_ =email.indexOf("_");
        int indexOfAt = email.indexOf("@");

        String firstname = email.substring(0, indexOf_);

        firstname = ( ""+firstname.charAt(0)).toUpperCase() + firstname.substring(1);

        System.out.println("firstname = " + firstname);

        String lastname = email.substring(indexOf_ +1, indexOfAt);

        lastname = lastname.substring(0,1).toUpperCase() + lastname.substring(1).toLowerCase();

        System.out.println("lastname = " + lastname);
    }
}
