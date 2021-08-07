package Day22_Recap;

import java.util.Scanner;

public class DoWhileLoopPractice {

    public static void main(String[] args) {

        int sumOfEven = 0;
        int sumOfOdd = 0;
        int i = 0;

        do{
            if(i%2==0){
                sumOfEven+=i;
            }else{
                sumOfOdd +=i;
            }

            i++;

        }while (i <=10);

        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);

        System.out.println("--------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        String userName = "JohnJames";
        String password = "John123";


    }
}
