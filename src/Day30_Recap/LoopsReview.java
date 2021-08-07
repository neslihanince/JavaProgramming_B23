package Day30_Recap;

public class LoopsReview {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        System.out.println("-----------------------------------");

        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("-------------------------------------");

        String str = "Java";

        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.println(str.charAt(i));
        }

        for (int i = str.length()-1; i > 0 - 1; i--) {
            System.out.println(str.charAt(i));
        }

        System.out.println();

        System.out.println("-------------------------------------");

        for (int i = 1, ch = 65; i <= 26; ch++ , i++ ){
            System.out.println(i + ". " + (char)ch);
        }

        System.out.println("-------------------------------------");

        for (int i = 26, ch = 90; i >= 1; ch-- , i-- ){
            System.out.println(i + ". " + (char)ch);
        }

        System.out.println("-------------------------------------");

        for (char i = 'A', j='a' ; i <= 'Z' && j <= 'z' ; j++, i++){
            System.out.println(i + "-" + j);
        }

        System.out.println("-------------------------------------");

        String word = "Pyhton";
        String reverse = "";
        for (int i = word.length()-1; i >= 0; i--){
            reverse +=word.charAt(i);
        }

        boolean isPalindrome = word.equals(reverse);

        System.out.println("isPalindrome = " + isPalindrome);


    }
}
