package Day13;

import java.util.Scanner;

public class ShippingInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Building Number : ");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your address : ");
        String streetAddress = scan.nextLine();

        System.out.println("Enter your city name : ");
        String cityName = scan.nextLine();

        System.out.println("Enter your State : ");
        String state = scan.next();

        System.out.println("Enter your zip code : ");
        String zipcode = scan.next();

        scan.nextLine();

        System.out.println("Enter your full name : ");
        String fullName = scan.nextLine();

        String shippingInfo = fullName+ "\n"+buildingNumber+" "+streetAddress+"\n"+cityName+" , "+zipcode;




    }
}
