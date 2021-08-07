package Day12_scanner;

import java.util.Scanner;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter you age: ");
        int age = input.nextInt();

        if(age >= 21){
            System.out.println("You are eligible to buy alchol");
        }else{
            System.out.println("Get out!");
        }

    }
}
