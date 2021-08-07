package Day27_Recap;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        int[] array = new int[2];
        array[0]= 10;
        array[1]= 20;
        array = new int[4];
        array[2]= 30;
        array[3]= 40;

        System.out.println(Arrays.toString(array));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0 ; i <= numbers.length-1 ; i++ ){

            System.out.println(numbers[i] + " ");
        }

    }
}
