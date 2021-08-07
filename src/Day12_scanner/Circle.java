package Day12_scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius ? ");

        double radius = input.nextDouble();

        double area = radius * radius * 3.14;
        double perimeter = 2 * radius * 3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
