package Day29_ReturnMethods;

import java.util.Arrays;

public class ReturnMethodPractice3 {

    public static void main(String[] args) {

        String str = "AAABBBBBCCCCC";
        String[] arr = str.split("");
        char[] arr2 = str.toCharArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        String result = removeDuplicates(str);
        System.out.println(result);
    }

    public static String removeDuplicates(String str) {
        String result= "";

        for (String each : str.split("")){
            if (!result.contains("" + each)){
                result += each;
            }
        }

        return result;

    }


}
