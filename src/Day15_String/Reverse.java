package Day15_String;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        String result = "";

        if(word.length() > 5 ){
            result = "Too Long";
        }else if(word.length() < 5){
            result = "Too Short";
        }else{
            result = "" + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);


        }
        System.out.println("result = " + result);
    }
}
