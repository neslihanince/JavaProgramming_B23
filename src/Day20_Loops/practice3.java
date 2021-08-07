package Day20_Loops;

public class practice3 {

    public static void main(String[] args) {

        String word = "cat dog dog cat";
        int numberOfCat = 0;
        int numberOfDog = 0;

        for (int i = 0; i <= word.length()-3 ; i++){
            String each = word.substring(i, i+3);
            if (each.equals("cat")){
                numberOfCat++;
            }
        }
        for (int i = 0; i <= word.length()-3 ; i++){
            String each1 = word.substring(i, i+3);
            if (each1.equals("dog")){
                numberOfDog++;
            }
        }

        System.out.println("numberOfDog = " + numberOfDog);
        System.out.println("numberOfCat = " + numberOfCat);

        boolean appear = numberOfCat == numberOfCat;

        System.out.println(appear);





    }
}
/*
3. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

        Ex:
            sentence = "cat dog dog cat"

            output:
                true
 */