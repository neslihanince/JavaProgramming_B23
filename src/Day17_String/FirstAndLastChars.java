package Day17_String;

import java.util.Locale;
import java.util.Scanner;

public class FirstAndLastChars {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a word:");
        String word = scan.next();

        String first = word.substring(0, 1);//toLowerCase();
        String last = word.substring(word.length()-1 );//toLowerCase();

        if(first.equalsIgnoreCase(last)){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }

    }
}
