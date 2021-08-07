package Day24_Arrays;

public class Grade {

    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy" , "Sarah" , "Abbos" , "Yuliang" , "Raphael" , "Tamerlan"};
        int [] scores = {90, 75, 80 , 85, 91, 92, 93};
        char [] grades = new char[names.length];

        for (int i = 0 ; i <= grades.length-1; i++){

       /*if(scores[i] >= 90){
            grades[i] = 'A';
        }else if(scores[i]  >= 80){
            grades[i] = 'B';
        }else if(scores[i] >= 70){
            grades[i] = 'C';
        }else if(scores[i]  >= 60){
            grades[i] = 'D';
        }else {
            grades[i] = 'F';
        }
        */

            grades[i] = (scores[i] >= 90)?'A' :(scores[i] >= 80)?'B' :(scores[i] >= 70)?'C' :(scores[i] >= 60)?'D':'F';

            System.out.println(names[i] + "' score is " + scores[i] + ", made " + grades[i]);
        }


    }
}
