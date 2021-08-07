package Day26_MultiDimensional;

import java.util.Arrays;

public class MultiDimensionalArray1 {

    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3,4}, {4,5},{6,7,8}};

        System.out.println(arr2D.length);

        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[1][1]);

        System.out.println("---------------------------------------------");

        for (int i = 0; i < args.length; i++){
            int[] each1Darray = arr2D[i];
            System.out.println(Arrays.toString(each1Darray));
            for(int j =0; j < arr2D[i].length ; j++){
                System.out.println(arr2D[i][j]);

            }
        }

        System.out.println("--------------------------------------------");

        for ( int[] each1D : arr2D ){

            for (int element : each1D){
                System.out.print(element + "");
            }
            System.out.println();

        }




    }
}
