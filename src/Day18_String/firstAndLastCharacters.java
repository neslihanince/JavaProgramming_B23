package Day18_String;

import java.util.Scanner;

public class firstAndLastCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1 = scan.next(); //"one"
        String word2 = scan.next(); //"eight"   ==> //"oneight"
/*
        if(word1.charAt( word1.length() -1) == word2.charAt(0)){
            System.out.println(word1+word2.substring(1));
        }else{
            System.out.println(word1+word2);
        }
*/

        if( word1.substring(word1.length()-1).equalsIgnoreCase(""+word2.charAt(0))){
            System.out.println(word1+word2.substring(1));
        }else{
            System.out.println(word1+word2);
        }






    }
}
