package Day17_String;

import java.util.Scanner;

public class accountNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account number:");
        String account = scan.next();
        char firstChar = account.charAt(0);

        switch (firstChar) {
            case '2':
                if (account.length() == 7) {
                    System.out.println("Valid Account");
                } else {
                    System.out.println("INVALID: it should be 7 characters long");
                }
                break;
            case '5':
                if (account.length() == 10) {
                    System.out.println("Valid Account");
                } else {
                    System.out.println("INVALID: it should be 10 characters long");
                }
                break;
            default:
                System.out.println("Invalid account");

            scan.close();
        }
    }
}


