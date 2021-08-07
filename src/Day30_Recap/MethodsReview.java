package Day30_Recap;

import Utilities.StringUtility;

public class MethodsReview {

    public static void main(String[] args) {

        String str = "Java";

        String result = StringUtility.reverse(str);

        System.out.println("result = " + result);

        String word = "Anna";

        System.out.println(StringUtility.isPalindroma(word));

    }


}
