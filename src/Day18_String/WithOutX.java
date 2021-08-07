package Day18_String;

import java.util.Locale;
import java.util.Scanner;

public class WithOutX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");

        String word = scan.next();

        if(word.toLowerCase().startsWith("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }

        scan.close();


        System.out.println("------------------------------------");

        String sentence ="I love Java programming language";

        if(sentence.toLowerCase().contains("java")){
            System.out.println("Has Java");
        }else{
            System.out.println("Does not have Java");
        }

        System.out.println("------------------------------------");

        String s1 = "I love cats and dogs";

        //boolean lovesCats = s1.equalsIgnoreCase("cats"); == false
        boolean lovesCats = s1.toLowerCase().contains("cats"); // verifies if s1 has cats


    }
}
