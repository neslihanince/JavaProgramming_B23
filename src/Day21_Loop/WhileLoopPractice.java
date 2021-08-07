package Day21_Loop;

public class WhileLoopPractice {

    public static void main(String[] args) {

        String sentence = "Java is fun, Java is cool";
        int countJava = 0;

        while(sentence.contains("Java")){
            countJava++;
            sentence = sentence.replaceFirst("Java", " ");

        }

        System.out.println("countJava = " + countJava);
    }
}
