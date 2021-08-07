package Day39_CustomClass.studentTask;

import java.time.LocalDate;
import java.util.ArrayList;

public class CybertekSchool {

    public static void main(String[] args) {

        Student[] group1 = {//Tamara
                new Student(), new Student(), new Student(), new Student(), new Student(),
                new Student(), new Student(), new Student(), new Student(), new Student()};
        //group1[0].setInfo();



        Student[] group2 = {//Oz Stark
                new Student(), new Student(),new Student(), new Student(),new Student(),
                new Student(),new Student(), new Student(),new Student(), new Student(), new Student()};
        //group2[0].setInfo();



        Student[] group3 = {new Student(), new Student(),new Student(), new Student(),new Student(),
                new Student(),new Student(), new Student(),new Student(), new Student(), new Student(), new Student()};
        //group3[0].setInfo();

        System.out.println("-------------------------------------------------------------------");

        Student[][] groups = {group1, group2, group3};

        ArrayList<Student> firstMarketGroup = new ArrayList<>(); // grade must be A
        ArrayList<Student> secondMarketGroup = new ArrayList<>();
        ArrayList<Student> thirdMarketGroup = new ArrayList<>();

        for (Student[] eachGroup : groups){
            for (Student eachStudent : eachGroup){
                if (eachStudent.grade == 'A'){
                    firstMarketGroup.add(eachStudent);
                }else if (eachStudent.grade == 'B'){
                    secondMarketGroup.add(eachStudent);
                }else{
                    thirdMarketGroup.add(eachStudent);
                }
            }
        }

        System.out.println("Market group1 : " + firstMarketGroup.size());
        System.out.println("Market group2 : " + secondMarketGroup.size());
        System.out.println("Market group3 : " + thirdMarketGroup.size());

        //who is the youngest student in firstMarketGroup
        LocalDate min = firstMarketGroup.get(0).DoB;
        String name = "";
        for (Student student : firstMarketGroup){
            if (student.DoB.isAfter(min)){
                min = student.DoB;
                name = student.name;
            }
        }

        System.out.println(min);
        System.out.println(name);


        System.out.println("------------------------------------------------------");
        // display the name of the students who were born between 1985-Jan-20 to 1995-Aug-15

        for (Student[] group : groups){
            for (Student student : group){
                if (student.DoB.isAfter(LocalDate.of(1985, 1, 20)) && student.DoB.isAfter(LocalDate.of(1985, 8, 15))){
                    System.out.println(student.name + " : " + student.DoB);
                }
            }
        }












    }
}
