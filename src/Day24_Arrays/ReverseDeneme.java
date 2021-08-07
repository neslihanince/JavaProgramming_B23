package Day24_Arrays;

import java.util.Arrays;

public class ReverseDeneme {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        int[] reversedArray = new int[array.length];

        int j = 0;

        for (int i = array.length-1; i >= 0 ; i--) {
            reversedArray[j++] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedArray));

    }
}
