package Day12_scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your score ?");

        int score = input.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("Congratulations ! Your grade is 'A'");
            } else if (score >= 80) {
                System.out.println("Great Job ! Your grade is 'B'");
            } else if (score >= 70) {
                System.out.println("Good Job ! Your grade is 'C'");
            } else if (score >= 60) {
                System.out.println("Passed . Your grade is 'D'");
            } else
                System.out.println("Failed . Your grade is 'F'");
        } else {
            System.out.println("Invalid");
        }
    }
}
