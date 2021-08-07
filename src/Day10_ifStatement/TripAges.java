package Day10_ifStatement;

public class TripAges {
    public static void main(String[] args) {

        int grade = 6;

        String location = "";
        int group = 0;
        String teacher = "";

        if(grade >=1 && grade <= 6){

            if(grade == 1){
                location = "Apple Orchard"; group = 3; teacher = "Ms. Smith";
            }else if(grade == 2){
                location = "Zoo"; group = 7 ; teacher ="Mr. Lee";
            }else if(grade == 3) {
                location = "Aquarium";
                group = 5;
                teacher = "Ms. Wilson";
            }else if(grade == 4) {
                location = "Movie theather";
                group = 2;
                teacher = "Ms. Reyes";
            }else if(grade == 5) {
                location = "Museum";
                group = 5;
                teacher = "Ms. Lela";
            }else{
                location = "Six Flags"; group = 8; teacher = "Mr. Watt";
            }
        }else{
            location = "Unknown"; teacher ="Unknown";
        }

        System.out.println("teacher = " + teacher);
        System.out.println("group = " + group);
        System.out.println("location = " + location);
        System.out.println("grade = " + grade);

    }
}
/*
Your school goes on a Field trip each year. The place you go will be based on your grade. Given some grade number (1-6) figure out the details of your field trip. Print the information at the end.

                Data based on grade:

                    grade - 1
                    location -  Apple orchard
                    number of groups - 3
                    teacher in charge - Ms. Smith

                    grade - 2
                    location - Zoo
                    number of groups - 7
                    teacher in charge - Mr. Lee

                    grade - 3
                    location - Aquarium
                    number of groups - 5
                    teacher in charge - Ms. Wilson

                    grade - 4
                    location - Movie theater
                    number of groups - 2
                    teacher in charge - Ms. Reyes

                    grade - 5
                    location - Museum
                    number of groups - 5
                    teacher in charge - Ms. Lela

                    grade - 6
                    location - Six Flags
                    number of groups - 8
                    teacher in charge - Mr. Watt
 */