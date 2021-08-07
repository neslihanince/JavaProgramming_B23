package Day29_ReturnMethods;

public class SystemExit_Vs_Return {

    public static void main(String[] args) {

        passOrFailed(150);

        System.out.println("Test Completed");
    }

    public static void passOrFailed(int score){

        if (score < 0 || score > 100 ){
            System.out.println("Invalid");
            // System.exit(0); // terminates everything
            return; // exits the current method
        }

        if (score >= 60){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }


}
