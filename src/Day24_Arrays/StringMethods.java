package Day24_Arrays;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {


        String sentence = "I love learning java programming language";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = 0 ; i < words.length; i++){
            System.out.println(words[i]+" ");
        }

        String email = "Cybertek@gmail.com";
        String [] arrays = email.split("@");
        System.out.println(Arrays.toString(arrays));


        String firstName = arrays[0];


        System.out.println("firstName = " + firstName);



    }
}
