package Day31_Recap;

import java.util.Arrays;

public class WarmUp {

    public static void main(String[] args) {

        String str = "MMMMMNNNNNNNBBBBBBBBAAAZZZZZZZZZZDDDDDDDDDDDDDDD";

        System.out.println(removeDup(str));
        String r = removeDup(str);

        System.out.println(r);

        System.out.println("--------------------------------------");

        String s1 = "heart";
        String s2 = "earth";

        System.out.println(isAnagram(s1, s2));

        System.out.println("----------------------------------------");

        String word = "MMMMMMMMNNNNNNNNNNNAAAAAAAAA";

        int n1 = frequency(word, 'M');
        System.out.println("n1 = " + n1);

        System.out.println("-----------------------------------------");

        String s = "aaaaaaaabcccccccccddddeeeeeeef";
        String unique = "";

        for (int i = 0; i <= s.length()-1 ; i++) {
            char each = s.charAt(i);
            int frequency = frequency(s, each);
            if (frequency == 1){
                unique += each;
            }
        }

        System.out.println(unique);

        System.out.println("-----------------------------------------------");

        String s3 = "AAABBCCCC";
        String result = "";

        for(char each : removeDup(s3).toCharArray()){
        int frequency = frequency(s3, each);
        result += "" + each + frequency;

        }

        System.out.println(result);

        System.out.println("-----------------------------------------------");

        String s4 = "MMMMMMMMMMMNNNNNNNNNNNNHHHHHHHHHHHHHYYYYYYYYTTRREEEEE";
        String result2 = frequencyOfChars(s4);

        System.out.println(result2);

        System.out.println("-----------------------------------------------");



    }

    public static String removeDup(String str) { //"AABBBCC"
        String result = ""; //"ABC"

        for (char ch : str.toCharArray()) {

            if (result.indexOf(ch) < 0) {
                //if the character is not conatined in the result, then concate the character
                result += ch;
            }

        }

        return result;
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);


        return Arrays.equals(ch1, ch2);


    }

    public static int frequency(String str, char ch){
        int count = 0;

        for (char each : str.toCharArray()){
            if (each == ch){
                count++;
            }
        }



        return count;
    }

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

    public static String frequencyOfChars(String str){
        String result = "";

        for(char each : removeDup(str).toCharArray()){
            int frequency = frequency(str, each);
            result += "" + each + frequency;

        }

        return result;

    }





}


