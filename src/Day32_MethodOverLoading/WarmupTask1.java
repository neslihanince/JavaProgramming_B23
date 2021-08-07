package Day32_MethodOverLoading;

import java.util.Arrays;

public class WarmupTask1 {

    public static void main(String[] args) {

        int sum1 = sumOf2Numbers(10, 20);

        System.out.println("sum1 = " + sum1);

        int sum2 = sumOf3Numbers(10,20,30);

        System.out.println("sum2 = " + sum2);
        
        int sum3 = sumOf4Numbers(10,20,30,40);

        System.out.println("sum3 = " + sum3);



        System.out.println("----------------------------------------------");

        int r1 = sum(10, 12);

        int r2 = sum(100, 200, 300);

        int r3 = sum(1000, 2000, 3000, 4000);

        System.out.println("r1 = " + r1);

        System.out.println("r2 = " + r2);

        System.out.println("r3 = " + r3);

        double r4 = sum(10.5, 10.5);

        //sum((int)2.5, (int)3.2, (int)4.8);



    }

    public static int sumOf2Numbers(int a, int b){
        return a+b;
    }

    public static int sumOf3Numbers(int a, int b, int c){
        return a+b+c;
    }

    public static int sumOf4Numbers(int a, int b, int c, int d){
        return a+b+c+d;
    }

    //------------------------------method overloading ---------------------------

    public static int sum(int a, int b){ return a+b; }

    public static double sum(double a, double b){ return a + b; }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d){

        //return sum( sum(a,b) , sum(c,d));

        return a + b + c + d;
    }

}
