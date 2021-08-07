package Day27_Recap;

public class FirstUniquesCharacters {

    public static void main(String[] args) {

        String str = "aaab ccddefggggh";

     /*   for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
        }

        */

        for (char each : str.replace(" ", "").toCharArray()) {

            if (str.indexOf(each) == str.lastIndexOf(each)){
                System.out.println(each);
            }
        }


    }
}
