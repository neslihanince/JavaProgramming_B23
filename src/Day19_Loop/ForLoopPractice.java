package Day19_Loop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for(int i = 0; i <= 1000; i++){
            System.out.println(i+" ");
        }

        System.out.println(); // to make sure next print statement starts from new line


        System.out.println("--------------------------");
        String odds = "";
        String evens = "";

        for(int i = 1; i < 100 ; i++) {
            if (i % 2 == 0) {
                odds += i + " ";
            } else {
                evens += i + " ";
            }
        }

        System.out.println("odds = " + odds);
        System.out.println("evens = " + evens);



    }
}
