package Day38_CustomClass.RectangleTask;

import Day38_CustomClass.RectangleTask.Rectangle;

import java.util.Arrays;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.setInfo(30, 20);
        rectangle1.length = 25;


        rectangle1.getInfo();

        System.out.println(rectangle1);

        System.out.println("------------------------------------------");

        Rectangle rectangle2 = new Rectangle();

        rectangle2.setInfo(50, 10);

        rectangle2.getInfo();

        System.out.println(rectangle2);

        System.out.println("------------------------------------------");

        Rectangle[] arr = {rectangle1, rectangle2};

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        System.out.println(Arrays.toString(arr));







    }
}
