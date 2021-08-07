package Day13;


import java.util.Scanner;

public class TaskCent {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter Cents");

        int cents = scan.nextInt();

        int dollars = cents / 100;

        int remainder = cents % 100;

        if(cents >= 0) {
            if (remainder == 0) {
                System.out.println(cents + " is equal to " + dollars + "dollars");
            } else {
                System.out.println(cents + " is equal to " + dollars + "dollars and " + remainder + " cents");
            }
        }else{
            System.out.println("Invaild Amount");
        }
    }
}

/*
. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

                Enter cents
                300 cents equal to: 3 dollars

 */
