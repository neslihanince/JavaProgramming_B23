package Day19_Loop;

import java.util.Scanner;

public class LuchTask1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");


        int sum = 0;

        for(int i = 1 ; i <= 10 ; i++){
            sum+=scan.nextInt();
        }
        System.out.println("sum = " + sum);

        scan.close();



    }
}
