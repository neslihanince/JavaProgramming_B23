package Day17_String;

public class StringMethods {

    public static void main(String[] args) {

        String sentence = "My favorite programming languager are: C#, Java, JavaScript";

        boolean hasPython = sentence.contains("Python");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.toLowerCase().contains("java");

        System.out.println("hasPython = " + hasPython);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);

        System.out.println("------------------------------------------------------------");
        String sentence2 = "Cybertek School is the best";
        boolean starWithCybertek = sentence2.startsWith("Cybertek");
        boolean starsWithSchool = sentence2.startsWith("School");

        System.out.println("starWithCybertek = " + starWithCybertek);
        System.out.println("starsWithSchool = " + starsWithSchool);

        System.out.println("-----------------------------------------------------------");

        boolean endsWithBest = sentence2.endsWith("best");

        System.out.println("en");
    }
}
