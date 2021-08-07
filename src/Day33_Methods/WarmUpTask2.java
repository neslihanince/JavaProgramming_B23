package Day33_Methods;

public class WarmUpTask2 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8};

        boolean r1 = contains(array, 10);

        System.out.println("r1 = " + r1);

    }

    public static boolean contains(int[] array, int element){

        boolean result = false;

        for (int each : array){
            if (each == element){
                return true;
            }
        }

        return false;
    }

    public static boolean contains(double[] array, double element){

        boolean result = false;

        for (double each : array){
            if (each == element){
                return true;
            }
        }

        return false;
    }

    public static boolean contains(String[] array, String element){

        boolean result = false;

        for (String each : array){
            if (each.equals(element)){
                return true;
            }
        }

        return false;
    }

    public static boolean contains(char[] array, char element){

        boolean result = false;

        for (int each : array){
            if (each == element){
                return true;
            }
        }

        return false;


    }
}
