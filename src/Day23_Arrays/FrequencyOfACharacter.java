package Day23_Arrays;

public class FrequencyOfACharacter {

    public static void main(String[] args) {

         String str = "aabcccd";

         char ch = 'c';

         int frequency = 0;

         for (int i = 0; i <= str.length()-1 ; i++){
             char each = str.charAt(i);
             if(each == ch){
                 frequency++;
             }
         }

        System.out.println("frequency = " + frequency);
    }
}
