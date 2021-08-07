package Day20_Loops;

public class practice2 {

    public static void main(String[] args) {

        String sentence = "Java Java Java Java ";
        int count = 0;

        for (int i=0 ; i <= sentence.length()-4 ; i++){
            String each = sentence.substring(i, i+4);
            if(each.equals("Java")){
                count++;
            }
        }
        System.out.println("count = " + count);

        System.out.println("--------------------------------");

        String sentence1 = "Phyton Phyton Phyton";
        int count1 = 0;

        for (int i = 0 ; i <= sentence1.length()-6 ; i++){
            String each1 = sentence1.substring(i, i+6);
            if(each1.equals("Phyton")){
                count1++;
            }
        }

        System.out.println("count1 = " + count1);





    }
}
/*
2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2
 */