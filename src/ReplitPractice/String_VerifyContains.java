package ReplitPractice;

import java.util.Scanner;

public class String_VerifyContains {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();

        String word = scan.nextLine();

        boolean hasWord =sentence.contains(word);

        System.out.println(hasWord);


    }


}
/*
Write a program that will verify if the **sentence** contains **word**. Print out the result as a boolean value.
 */