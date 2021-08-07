package Day33_Methods;

import java.util.Arrays;

public class WarmUpTask1 {

    public static void main(String[] args) {

        String[] students = {"Mohammed", "Aleksandra", "Elmira"};

        students = reverseStringArray(students);

        System.out.println(Arrays.toString(students));

        System.out.println("----------------------------------------");

        int[] numbers = {10, 20, 30, 40, 50};

        numbers = reverseIntegerArray(numbers);

        System.out.println(Arrays.toString(numbers));



    }





    public static int[] reverseIntegerArray(int[] array ){

        int[] result = new int[array.length];

        for (int i = array.length-1, j=0 ; i >= 0 ; i--, j++){
            result[j]= array[i];
        }

        return result;
    }

    public static String[] reverseStringArray(String[] array ){

        String[] result = new String[array.length];

        for (int i = array.length-1, j=0 ; i >= 0 ; i--, j++){
            result[j]= array[i];
        }

        return result;
    }

    public static double[] reverseDoubleArray(double[] array ){

        double[] result = new double[array.length];

        for (int i = array.length-1, j=0 ; i >= 0 ; i--, j++){
            result[j]= array[i];
        }

        return result;
    }

    public static char[] reverseCharArray(char[] array ){

        char[] result = new char[array.length];

        for (int i = array.length-1, j=0 ; i >= 0 ; i--, j++){
            result[j]= array[i];
        }

        return result;
    }


}
