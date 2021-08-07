package Day16_String;

import java.util.Scanner;

public class StringPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string with 3 letter: ");
        String word = scan.next();

        if(word.length() == 3) {
            if (word.length() == 3) {
                System.out.println("Cool word");
            } else {
                System.out.println("Okay word");
            }
        }else{
            if(word.length()<3){
                System.out.println("Word is too short");
            }else{
                System.out.println("Word is too long");
            }
        }

    }
}
