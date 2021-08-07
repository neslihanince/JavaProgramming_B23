package Day12_scanner;

public class breakfastTask {

    public static void main(String[] args) {

        char grade = 'A';
        String result = "";

        switch (grade){
            case 'A':
                result = "excellent";
            break;
            case 'B':
                result = "great job";
            break;
            case 'C':
                result = "good";
                break;
            case 'D':
                result = "passed";
                break;
            case 'F':
                result = "failed";
                break;
            default:
                result = "invalid";
                break;

        }
        System.out.println(result);


    }

}


/*
1. a char variable named grade is given. use switch statement to print the following messages:
                if the grade is 'A' print excellent
                if the grade is 'B' print great job
                if the grade is 'C' print good
                if the grade is 'D' print passed
                if the grade is 'F' print failed
                other wise print invalid

2. write a program that can print any number between 1 ~ 10, but for number which is a multiple of 3 print "Fizz" instead of the number and for number which is a multiple of 5, print "Buzz" instead of the number, and for number which is a multiple of both 3 and 5 both print "FizBuzz" instead of the number.

                  MUST use switch statement
 */