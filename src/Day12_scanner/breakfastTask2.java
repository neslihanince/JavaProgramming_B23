package Day12_scanner;

public class breakfastTask2 {

    public static void main(String[] args) {

        int number = 5;
        
        switch(number){
            case 3 :
            case 6 :
            case 9 :
                System.out.println("Fizz");
                break;
            case 5 :
            case 10 :
                System.out.println("Buzz");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 4:
                System.out.println("four");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            default:
                System.out.println("Invalid");
                break;








        }




    }
}
 /*
 2. write a program that can print any number between 1 ~ 10,
 but for number which is a multiple of 3 print "Fizz" instead of the number and for number which is a multiple of 5,
 print "Buzz" instead of the number,
 and for number which is a multiple of both 3 and 5 both print "FizBuzz" instead of the number.

                  MUST use switch statement
  */