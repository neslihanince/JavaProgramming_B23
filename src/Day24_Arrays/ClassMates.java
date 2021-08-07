package Day24_Arrays;

import java.util.Arrays;

public class ClassMates {

    public static void main(String[] args) {

        String[] classMates = {"Gulistan" , "Fruza" , "Ahmet" , "Memet" , "Muhter" , "Tamara" , "Abbos" , "Shirin" ,
        "Robinson " , "Shirin"};

        System.out.println(Arrays.toString(classMates));

        for (int i = 0; i <= classMates.length; i++ ) {

            System.out.println(classMates[i].substring(0, 3));
        }

    }
}
