package Day13;

import java.util.Scanner;

public class ScannerMethods {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("You are full time emloyee: ");
        boolean isFullTime = scan.nextBoolean();

        System.out.println("You are an adult: ");
        boolean isAdult = scan.nextBoolean();

        System.out.println("You are married: ");
        boolean isMarried = scan.nextBoolean();

        System.out.println("isMarried = " + isMarried);
        System.out.println("isAdult = " + isAdult);
        System.out.println("isFullTime = " + isFullTime);


    }
}
