package Day14;

import java.util.Scanner;

public class stock {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many total share you value in the stock market?");

        int totalShares = scan.nextInt();

        if(totalShares > 0 ){
            System.out.println("How much is your total value in the stock market?");
            double totalValue = scan.nextDouble();

            scan.nextLine();

            System.out.println("Enter the name of the company: ");
            String companyName = scan.nextLine();

            System.out.println("Your total stock market holding is $" + totalValue + " which is made up of " + totalShares);
            System.out.println("companyName = " + companyName);

        }else{
            System.out.println("Invalid number");
        }

        scan.close();


    }
}
