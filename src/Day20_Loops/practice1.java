package Day20_Loops;

import java.util.Scanner;

public class practice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int factorial = 1;

        for (int i = number; i >= 1 ; i--){
            factorial*=i;
        }

        System.out.println("factorial = " + factorial);

        scan.close();

    }
}
/*
1. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */