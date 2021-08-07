package Day20_Loops;

import java.util.Scanner;

public class factorialNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int result = 1;

        for (int i = number ; i >= 1 ; i--){
            result *=i;
        }

        System.out.println("result = " + result);
    }
}
