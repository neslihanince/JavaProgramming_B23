package Day13;

import java.util.Scanner;

public class speedLimit {

    public static void main(String[] args) {


        System.out.println("Enter your current speed:");

        int currentspeed = new Scanner(System.in).nextInt();
        int speedlimit = 55;
        int overlimit = currentspeed - speedlimit;

        if(overlimit > 0 ) {
                System.out.println("You're driving " + overlimit + " mph over the limit. Slow down!");
            } ;



    }
}
