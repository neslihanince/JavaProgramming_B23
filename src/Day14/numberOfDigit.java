package Day14;

import java.util.Scanner;

public class numberOfDigit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 100000");
        int n = scan.nextInt();

        String result = "";

        if(n >= 1 && n <= 100000){

            if(n <= 9){
                result = "1 digit";
            }else if(n >9 && n <=99){
                result = "2 digits";
            }else if(n <= 999 ){
                result = "3 digits";
            }else if( n <= 9999){
                result = "4 digits";
            }else if(n <= 99999 ) {
                result = "5 digits";
            }else{
                result ="6 digits";
            }
        }else{
            result = "Invalid Number";
        }

        System.out.println(n + " has " + result);


        scan.close();
    }
}
