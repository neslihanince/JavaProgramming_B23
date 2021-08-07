package Day23_Arrays;

import java.util.Scanner;

public class HighestAndLowestScore {

    public static void main(String[] args) {

        String[] names = {"Mike", "Adam","Tonny", "John", "Ammy", "Ahmet"};

        int[] scores = {85, 70, 95, 90, 100, 110};

        int maxScore = scores[0];
        String maxName = "";

        int minScore = scores[0];
        String minName = "";

        for (int i =0; i <= names.length-1; i++){
            String eachName = names[i];
            int eachScore = scores[i];

            if (eachScore > maxScore){
                maxScore = eachScore;
                maxName = eachName;

            }

            if(eachScore < minScore){
                minScore = eachScore;
                minName = eachName ;
            }
        }

        System.out.println(maxName + ":" + maxScore);
        System.out.println(minName + ":" + minScore);






    }
}
