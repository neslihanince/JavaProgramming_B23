package Day24_Arrays;

import java.util.Arrays;

public class ClassMatesDeneme {

    public static void main(String[] args) {

        String[] classMates = {"Gulistan" , "Fruza" , "Ahmet" , "Memet" , "Muhter" , "Tamara" , "Abbos" , "Shirin" ,
                "Robinson " , "Shirin"};

        System.out.println(Arrays.toString(classMates));

        for (int i = 0; i <= classMates.length-1; i++){
            System.out.println(classMates[i].substring(0,3));

        }




    }
}
