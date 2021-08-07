package Day20_Loops;

public class frequncy {

    public static void main(String[] args) {

        String sentence = " Java Java ";
        int count = 0;
        // "Java";
        /*
        String str = sentence.substring(0, 4); // "Java"

        String str2 = sentence.substring(1, 5); // "ava "

        String str3 = sentence.substring(2, 6); // "va J"

        String str4 = sentence.substring(3, 7); // "a Ja"
*/

        for(int i = 0; i <= sentence.length()-4; i++ ){
            String each = sentence.substring(i, i+4);
            if(each.equals("Java")){
                count++;
            }


        }
        System.out.println("count = " + count);

    }
}
