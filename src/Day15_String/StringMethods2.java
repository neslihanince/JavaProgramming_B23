package Day15_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String sentence = "Java Programming Language";

        String name = sentence.substring(0, 3+1);

        System.out.println(name);

        String s2 = "Cybertek School";

        String name2 = s2.substring(0, 7+1);

        System.out.println(name2);

        //String name3 = s2.substring(9, 14+1);// we can use 15 for last word.

        String name3 = s2.substring(9);

        System.out.println(name3);

        System.out.println("--------------------------------------------------");

        String sentence2 = "Java is a programming language";

        String name4 = sentence2.substring(10);
        System.out.println(name4);

        String name5 = sentence2.substring(10, 20+1);
        System.out.println(name5);

        System.out.println("--------------------------------------------------");

        String sentence3 = "Python is an easy language";

        sentence3 = sentence3.replace("Python","Java");

        System.out.println(sentence3);


    }
}
