package Day18_String;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        char f = word.charAt(0);

        String result = "First character is";

        if (f >= '0' && f <= '9') {
            result = "digit";
        } else if (f >= 'a' && f <= 'z') {
            result = "lowercase letter";
        } else if (f >= 'A' && f <= 'Z') {
            result = "uppercase letter";
        } else {
            result = "special letter";
        }
        System.out.println(result);
        scan.close();
    }
}
