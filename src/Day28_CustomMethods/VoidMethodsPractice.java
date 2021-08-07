package Day28_CustomMethods;

public class VoidMethodsPractice {

    public static void main(String[] args) {

        printOddNumber(100, 125);

        printEvenNumber(100, 200);

        calculateAge(2000, 2021);

        System.out.println("-----------------------------------");

        calculate(100,200,'-');

    }

    public static void printOddNumber(int from, int to){

    }/*{

        for (int i = from; i <to ; i++) {
            if(i%2 !=0){
                System.out.print(i+" ");
            }
        }

        System.out.println();*/

    public static void printEvenNumber(int from, int to){/*

            for (int i = from; i <= to ; i++) {

                if(i % 2 == 0){
                    System.out.println(i +" ");
                */}

    public static void calculateAge(int birthyear, int currentYear){/*
        System.out.println("Your age is: " + (2021 - birthyear));
    } */}

        public static void calculate(int num1, int num2, char operator){

            switch (operator){
                case'-':
                    System.out.println("Subtraction: " + (num1-num2));
            }
        }


}
