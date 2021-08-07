package Day10_ifStatement;

public class NumberToWords {
    public static void main(String[] args) {

        int number= 8;
        String name = "";

        if(number >= 0 && number <= 9) {
            if (number == 0) {
                name = "zero";
            } else if (number == 1) {
                name = "one";
            } else if (number == 2) {
                name = "two";
            } else if (number == 3) {
                name = "three";
            } else if (number == 4) {
                name = "four";
            } else if (number == 5) {
                name = "five";
            } else if (number == 6) {
                name = "six";
            } else if (number == 7) {
                name = "seven";
            } else if (number == 8) {
                name = "eight";
            } else if (number == 9) {
                name = "nine";
            }

        }else{
            name = "Invalid Name";
        }

        System.out.println(" Name = " + name);
    }
}