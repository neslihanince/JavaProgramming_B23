package Day19_Loop;

import java.util.Scanner;

public class TaskCalculate {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100 ; i++){
            sum +=i;
        }
        System.out.println("sum = " + sum);

        System.out.println("---------------------------");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");

        int num = scan.nextInt();
        int sub = 0;


        for (int i = 1; i <= num ; i++){
            sub +=i;
        }
        System.out.println("sub = " + sub);



    }
}
