package Day31_Recap;

import Utilities.StringUtility;

public class WarmUpTasks2 {

    public static void main(String[] args) {

        String sentence = "Java java jAvA";
        String word = "java";

        int count = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        System.out.println(count);

        System.out.println("-----------------------------------------------");

        String sentence2 = "Cybertek cybertek CyBertek, CYBERTEK";
        String word2 = "cybertek";

        int n2 = frequencyOfWord(sentence2, word2);

        System.out.println(n2);

        System.out.println("-----------------------------------------------");

        String str = "Racecar";

        boolean isPalindrome = StringUtility.isPalindroma(str);

        System.out.println("isPalindrome = " + isPalindrome);

        String str2 = "CCYYBBEERRTTEEKK";

        str2 = StringUtility.removeDup(str2);

        System.out.println(str2);

    }

    public static int frequencyOfWord(String sentence, String word) {
        int count = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            count++;
        }

        return count;
    }

}
