package recap;


import java.util.Scanner;

public class emailTask {

    public static void main(String[] args) {


        String email = new Scanner(System.in).nextLine();

        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");

        String firstName = email.substring(0, indexOf_);
        String lastName = email.substring(indexOf_ +1 , indexOfAt);

        String remaining = email.substring(indexOfAt);

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        String result = lastName+"_"+firstName+remaining;
        System.out.println(result);





    }
}
