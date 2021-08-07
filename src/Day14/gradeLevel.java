package Day14;

import java.util.Scanner;

public class gradeLevel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a grade level: ");
        byte num =scan.nextByte();
        String gradeLevel = "";

        if(num >= 1 && num <= 18){

            gradeLevel = (num <= 5)? "Elementary school" :( num <= 8)? "Middle School": (num <= 12 )? "High School"
                    :( num <=16)? "College" : "Grade School" ;

        }else{
            gradeLevel = "Invalid grade";
        }

        System.out.println("gradeLevel = " + gradeLevel);



        scan.close();

    }


}
