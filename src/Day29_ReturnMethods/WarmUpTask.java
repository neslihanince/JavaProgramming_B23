package Day29_ReturnMethods;

import java.util.Arrays;

public class WarmUpTask {

    public static void main(String[] args) {

        posNegZero(10);

        System.out.println("----------------------------------");

        int[] numbers = {10, 20, 0, -30, -4};

        for (int num : numbers) {
            posNegZero(num);
        }
        System.out.println("----------------------------------------");

        int[] arr1 = {1, 2, 3, 4},
                arr2 = {5, 6, 7, 8, 9, 10};

        mergeTwoArrays(arr1, arr2);

        System.out.println("----------------------------------------");

        formatFullName("cybErTek", "ScHool" );

        System.out.println("----------------------------------------");

        printMaxNumber(10, 20);

        System.out.println("----------------------------------------");

        int[] array = {100, 200, 0, -1, -10};

        printInDescendingOrder(array);




    }

    public static void posNegZero ( int num) {

        if (num > 0) {
                System.out.println(num + " is positive number");
        } else if (num < 0) {
                System.out.println(num + " is negative number");
        } else {
                System.out.println(num + " is zero");
        }

    }

    public static void mergeTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+ arr2.length];
        int i = 0;
        for (int each : arr1){
            arr3[i++] = each;
        }

        for (int each : arr2) {
            arr3[i++] = each;
        }

        System.out.println(Arrays.toString(arr3));
    }

    public static void formatFullName(String firstName, String lastName){

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName + " " + lastName;

        System.out.println("fullName = " + fullName);

    }

    public static void printMaxNumber (int num1, int num2){

        System.out.println( (num1 > num2 ? num1 : num2 ) + " is maximum number" );
    }

    public static void printInDescendingOrder (int[] arr){

        Arrays.sort(arr);

        int[] result = new int[arr.length];

        for (int i = arr.length-1, j=0; i >= 0 ; i--,j++) {

            result[j] = arr[i];
        }

        System.out.println(Arrays.toString(result));

    }






}
