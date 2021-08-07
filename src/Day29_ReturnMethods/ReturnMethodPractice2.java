package Day29_ReturnMethods;

public class ReturnMethodPractice2 {

    public static void main(String[] args) {

        //grade(78);

        System.out.println(grade(100));

        String r = grade(100);
        System.out.println(r);

    }

    public static String grade(int score){

        /*if (score > 100 || score < 0){
            System.out.println("Invalid");
            return ; // exit the method
        }

        if (score >= 90){
            System.out.println("A");
        }else if (score >= 80){
            System.out.println("B");
        }else if (score >= 70){
            System.out.println("C");
        }else if (score >= 60){
            System.out.println("D");
        }else {
            System.out.println("F");
        } */

        String result = "Invalid";

        if (score >= 0 && score <= 100 ){
            result = (score >= 90)? "A" : (score >= 80)? "B" :(score >= 70)? "C" : (score >= 60)? "D" : "F";
        }
        return result;


    }

}
