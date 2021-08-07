package Day14;

import java.util.Scanner;

public class SwitchPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with? ");
        int numberOfPeople = scan.nextInt();

        if(numberOfPeople >= 1){

        switch (scan.nextInt()) {
            case 1:
            case 2:
                System.out.println("Live with less than 3 people");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Live with 3-6 people");
                break;

            default:
                System.out.println("Live with more tha 6 people");
        }

        }else{
            System.out.println("Invalid number");


        }
    }
}
