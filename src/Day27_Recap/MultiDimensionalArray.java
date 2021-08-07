package Day27_Recap;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        String[] scrum1 = {"Komiljon", "yuliang", "Merve", "Nadima"};
        String[] scrum2 = {"Sabir", "Tamara"};
        String[] scrum3 = {"Tugba", "Hilal", "Dilem"};

        String[][] scrumTeams = {scrum1, scrum2, scrum3};
        //                          0,     1,        2

        System.out.println(Arrays.toString(scrumTeams[0]));

        // Tamara

        System.out.println(scrumTeams[1][1]);

        System.out.println("--------------------------------------");

        for (String[] eachScrum : scrumTeams) {
            System.out.print(Arrays.toString(eachScrum));
        }

        System.out.println("--------------------------------------");
        for (String[] eachScrum: scrumTeams) {
            for (String eachMember : eachScrum) {
                System.out.print(eachMember + " ");
            }
        }

        System.out.println("---------------------------------------");

        for (int i = 0; i < scrumTeams.length; i++){
            for (int j = 0; j < scrumTeams[i].length; j++) {
                System.out.print(scrumTeams[i][j]+ " ");
            }
        }

        System.out.println("----------------------------------------");

        int[] numbers = {1,2,3,4,5};
        int temp = numbers[1];

        numbers[1] = numbers[3];
        numbers[3] = temp;

        System.out.println(Arrays.toString(numbers));



    }
}
