package recap;

public class emailTask2 {

    public static void main(String[] args) {

        String email = "craig_federighi@apple.com";

        int indexOf_= email.indexOf("_");
        int indexOfAt = email.indexOf("@");

        String firstName = email.substring(0, indexOf_);

        firstName = ( ""+firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();

        String lastName = email.substring(indexOf_+1, indexOfAt);

        lastName = lastName.substring(0,1) .toUpperCase()+ lastName.substring(1).toLowerCase();

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        String domain = email.substring(indexOfAt + 1, email.indexOf("."));

        System.out.println("domain = " + domain);





    }
}
