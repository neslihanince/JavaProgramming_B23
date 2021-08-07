package Utilities;

import java.util.Arrays;

public class ArraysUtility {

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

    public static int max(int[] array){
        int max = array[0];

        for (int each : array){
            max = Math.max(each, max);
        }

        return max;

    }

    public static double max(double[] array){
        double max = array[0];

        for (double each : array){
            max = Math.max(each, max);
        }

        return max;

    }

    public static int min(int[] array){
        int min = array[0];

        for (int each : array){
            min = Math.max(each, min);
        }

        return min;

    }

    public static double min(double[] array){
        double min = array[0];

        for (double each : array){
            min = Math.min(each, min);
        }

        return min;

    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int j = 0;

        for (int each : arr1){
            arr3[j++] = each;
        }
        for (int each : arr2){
            arr3[j++] = each;
        }

        return arr3;

    }

    public static double[] merge(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length + arr2.length];

        int j = 0;

        for (double each : arr1){
            arr3[j++] = each;
        }
        for (double each : arr2){
            arr3[j++] = each;
        }

        return arr3;

    }

    public static String[] merge(String[] arr1, String [] arr2){
        String[] arr3 = new String[arr1.length + arr2.length];

        int j = 0;

        for (String each : arr1){
            arr3[j++] = each;
        }
        for (String each : arr2){
            arr3[j++] = each;
        }

        return arr3;

    }

    public static char[] merge(char[] arr1, char [] arr2){
        char[] arr3 = new char[arr1.length + arr2.length];

        int j = 0;

        for (char each : arr1){
            arr3[j++] = each;
        }
        for (char each : arr2){
            arr3[j++] = each;
        }

        return arr3;

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

    public static int[] unique(int[] array) {
        int[] result = {};

        for (int each : array) {
            if (frequencys(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    public static double[] unique(double[] array) {
        double[] result = {};

        for (double each : array) {
            if (frequencys(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    public static String[] unique(String [] array) {
        String[] result = {};

        for (String each : array) {
            if (frequencys(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    public static char[] unique(char [] array) {
        char[] result = {};

        for (char each : array) {
            if (frequencys(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    public static int frequencys(int[] array, int element){
        int count = 0;
        for (int each : array){
            if (each == element){
                count++;
            }
        }

        return count;
    }

    public static double frequencys(double[] array, double element){
        int count = 0;
        for (double each : array){
            if (each == element){
                count++;
            }
        }

        return count;
    }

    public static int frequencys(String[] array, String element){
        int count = 0;
        for (String each : array){
            if (each.equals(element)){
                count++;
            }
        }

        return count;
    }

    public static int frequencys(char[] array, char element){
        int count = 0;
        for (char each : array){
            if (each == element){
                count++;
            }
        }

        return count;
    }


}
