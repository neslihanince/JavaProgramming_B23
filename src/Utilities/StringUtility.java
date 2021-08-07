package Utilities;

import java.util.Arrays;

public class StringUtility {

    //reverses any given string, and returns it
    public static String reverse(String str){
        String reverse = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }

        return reverse;

    }

    //checks if the given string is palindrome, returns boolean
    public static boolean isPalindroma(String str){
        String reversedStr = reverse(str);
        return str.equalsIgnoreCase(reversedStr);
    }


    //create a method that can remove duplicates from string, returns string
    public static String removeDup(String str){ //"AABBBCC"
        String result = ""; //"ABC"

        for (char ch : str.toCharArray()) {

            if (result.indexOf(ch) < 0){
                //if the character is not conatined in the result, then concate the character
                result += ch;
            }

        }

        return result;
    }


    //check if two string are anagram , returns boolean
    public static boolean isAnagram(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);


        return  Arrays.equals(ch1, ch2);



    }

    //returns the frequency of ch from the string str
    public static int frequency(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }


        return count;
    }

    //returns the unique characters from the string
    public static String uniqueChars(String s){
        String unique = "";

        for (int i = 0; i <= s.length()-1 ; i++) {
            char each = s.charAt(i);
            int frequency = frequency(s, each);
            if (frequency == 1){
                unique += each;
            }
        }

        return unique;

    }

    //returns the frequency each each characters, returns string
    public static String frequencyOfChars(String str){
        String result = "";

        for(char each : removeDup(str).toCharArray()){
            int frequency = frequency(str, each);
            result += "" + each + frequency;

        }

        return result;

    }

    //returns the frequency of the word from thw sentence
    public static int frequencyOfWord(String sentence, String word){
            int count = 0;
            sentence = sentence.toLowerCase();
            word = word.toLowerCase();
            while (sentence.contains(word)) {
                sentence = sentence.replaceFirst(word, "");
                count++;
            }

            return count;
    }

    public static int[] removeDup(int[] array){

        int[] newArr = {};

        for (int each : array){
            if (!ArraysUtility.contains(newArr, each)){
                newArr = ArraysUtility.addElement(newArr, each);
            }
        }

        return newArr;

    }

    public static double[] removeDup(double[] array){
        double[] newArr = {};

        for (double each : array){
            if (!ArraysUtility.contains(newArr, each)){
                newArr = ArraysUtility.addElement(newArr, each);
            }
        }

        return newArr;

    }

    public static String[] removeDup(String[] array){

        String[] newArr = {};

        for (String each : array){
            if (!ArraysUtility.contains(newArr, each)){
                newArr = ArraysUtility.addElement(newArr, each);
            }
        }

        return newArr;

    }

    public static char[] removeDup(char[] array){

        char[] newArr = {};

        for (char each : array){
            if (!ArraysUtility.contains(newArr, each)){
                newArr = ArraysUtility.addElement(newArr, each);
            }
        }

        return newArr;

    }









}
