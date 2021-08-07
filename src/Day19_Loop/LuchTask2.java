package Day19_Loop;

import java.util.Scanner;

public class LuchTask2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int maxn =-212334827;

        for (int i = 0 ; i <= 5 ; i++){
            System.out.println("Enter a number:");
            int n = scan.nextInt();

            if(n > maxn){
                maxn = n;
            }

            System.out.println("maxn = " + maxn);
        }
    }
}
