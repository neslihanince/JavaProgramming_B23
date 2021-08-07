package Day18_String;

import java.util.Scanner;

public class EmailTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String email = "mike_tyson@gmail.com";
        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");
        String firstName = email.substring(0, indexOf_);
        String lastName = email.substring(indexOf_ +1, indexOfAt);
        String remaining = email.substring(indexOfAt);

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("remaining = " + remaining);
        System.out.println(email);

    }

}
