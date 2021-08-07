package Day19_Loop;

public class ForLoopPractice2 {

    public static void main(String[] args) {

        for(int i = 65; i <= 90 ; i++){
            System.out.println( (char) i+" ");
        }

        System.out.println();
        System.out.println("---------------------------");

        for(char i = 'A'; i <= 'Z' ; i++){
            System.out.println(i + " ");
        }
        System.out.println();

        System.out.println("-----------------------------");

        for(char i = 'Z'; i >= 'A' ; i--){
            System.out.println(i+" ");
        }
        System.out.println();

        System.out.println("------------------------------");

        for (char i = 1000; i <= 30000 ; i++){
            System.out.println(i+" ");
        }




    }

}
