package Day32_MethodOverLoading;

import java.util.Arrays;

public class WarmUpTask2 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        int element = 10;

        System.out.println(Arrays.toString(array));

        array = addInteger(array, element);

        System.out.println(Arrays.toString(array));

        array = addInteger(array, 11);

        System.out.println(Arrays.toString(array));

        double[] array2 = {2.5, 3.5};

        System.out.println(Arrays.toString(array2));

        array2 = addDouble(array2, 4.5);

        System.out.println(Arrays.toString(array2));

        System.out.println("-----------------------------------------------");

        String[] group1 = {"Sabir", "Gabil", "Dilem"};

        String student = "Christian";

        group1 = addString(group1, student);

        System.out.println(Arrays.toString(group1));

        System.out.println("-----------------------------------------------");

        char[] array3 = {'A', 'B'};

        array3 = addChar(array3, 'C');

        System.out.println(Arrays.toString(array3));

        System.out.println("---------------Method Overloading-----------------");

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};

        arr1 = addElement(arr1, 8);

        System.out.println(Arrays.toString(arr1));








    }

    public static int[] addInteger(int[] array, int number){
        /*int[] result = new int[array.length+1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = number; */

        int[] result = Arrays.copyOf(array, array.length+1);
        result[ result.length-1] = number;

        return result;

    }

    public static double[] addDouble(double[] array, double number){
        double[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = number ;

        return result;
    }

    public static String[] addString(String[] array, String str){
        String[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length-1] = str;

        return result;

    }

    public static char[] addChar(char[] array, char str){
        char[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length-1] = str;

        return result;

    }

    //-------------------------method overloading------------------------------------

    public static int[] addElement(int[] array, int number){
        /*int[] result = new int[array.length+1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = number; */

        int[] result = Arrays.copyOf(array, array.length+1);
        result[ result.length-1] = number;

        return result;

    }

    public static double[] addElement(double[] array, double number){
        double[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = number ;

        return result;
    }

    public static String[] addElement(String[] array, String str){
        String[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length-1] = str;

        return result;

    }

    public static char[] addElement(char[] array, char str){
        char[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length-1] = str;

        return result;

    }



}
