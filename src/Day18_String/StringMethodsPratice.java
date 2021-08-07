package Day18_String;

public class StringMethodsPratice {

    public static void main(String[] args) {

        String str = "abcd";
        int indexOfK = str.indexOf("k");

        System.out.println("indexOfK = " + indexOfK);

        if(indexOfK >= 0 ){
            System.out.println("The string has character k");
        }else{
            System.out.println("The string does not have k");
        }


        System.out.println("--------------------------------");

        String sentence = "I like to learn C#, C# is cool J";

        if(sentence.indexOf("Java") >= 0){
            System.out.println("sentence has a java");
        }else{
            System.out.println("sentence does not have java");
        }

        System.out.println("--------------------------------");

        String sentence2 = "I love Java, Java is cool";

        boolean isUnique = sentence2.indexOf("Java") == sentence2.lastIndexOf("Java");

        System.out.println("---------------------------------");

        String schoolName = "Cybertek School";
        String name = schoolName.substring(0);

        System.out.println("name = " + name);

        String sentence3 = "I live in California, I go to Cybertek school";
        String name2 = sentence3.substring( sentence3.indexOf("Cy"), sentence3.lastIndexOf(" school"));

        System.out.println("name2 = " + name2);



    }

}
