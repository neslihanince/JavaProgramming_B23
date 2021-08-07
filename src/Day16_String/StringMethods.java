package Day16_String;

public class StringMethods {

    public static void main(String[] args) {

        String email = "Cybertek@yahoo.com";
        email = email.replace("yahoo","gmail");

        System.out.println(email);

        String sentence = "C# is cool, C# is fun";
        sentence = sentence.replaceFirst("C#", "Java");

        System.out.println(sentence);

        String s = "Cat Dog Cat Dog Cat";
        //s = s.replace("Cat", "Dog");

        s = s.replaceFirst("Cat", "Dog");
        System.out.println(s);

        System.out.println("-------------------------------------------");

        String sentence2 = "Java is a cool language";
        int indexOfFirstA = sentence2.indexOf("a");
        int indexOfSecondA = sentence2.indexOf("a ");
        int indexOfThirdA = sentence2.indexOf("a c");
        int indexOfFourthA = sentence2.indexOf("an");
        int indexOfFifthA = sentence2.indexOf("ag");

        System.out.println("indexOfFirstA = " + indexOfFirstA);
        System.out.println("indexOfSecondA = " + indexOfSecondA);
        System.out.println("indexOfThirdA = " + indexOfThirdA);
        System.out.println("indexOfFourthA = " + indexOfFourthA);
        System.out.println("indexOfFifthA = " + indexOfFifthA);

        System.out.println("---------------------------------------");

        String s2 = "  ";
        s2 = s2.trim();
        boolean r1 = s2.isEmpty();
        System.out.println("r1 = " + r1);

        System.out.println("---------------------------------------");

        String str1 = "Cat";
        String str2 = new String("Cat");
        String str3 = new String("Cat");


        System.out.println(str1 == str2);
        System.out.println( str1.equals(str2) );

        System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));

        System.out.println("----------------------------------------");

        String word1 = "Java";
        String word2 = "java";

        System.out.println(word1 == word2);
        System.out.println(word1.equals(word2));

        System.out.println(word1.equalsIgnoreCase(word2));



    }
}
