package Day11_switch;

public class yearlySalary {

    public static void main(String[] args) {

        double salary = 90000;
        int creditScore = 720;
        String result = ( salary >= 60000 && creditScore >= 650 ) ? "Loan Approved " : "Loan Denied " ;

        System.out.println("result = " + result);

        System.out.println("-------------------------------------------------------------------------");

        String sport = "Golf";
        int price = (sport == "Soccor" || sport == "Tennis" ) ? 100 : 50 ;
        System.out.println("price = " + price);


        System.out.println("--------------------------------------------");

        int n1 = 100,
                n2 = 200,
                n3 = 300;

        String result2 = ( n1 > n2 && n1 > n3) ? n1 + " is bigger" : (n2 > n1 && n2 > n3 ) ? n2 + " is bigger" : n3 + " is bigger";
        System.out.println("result2 = " + result2);

        System.out.println("--------------------------------------------");

        int number = 12;
        String name = "";

        if(number >= 1 && number <= 12){
            name = (number == 1 )? "Jan" :(number == 2)? "Feb" :(number == 3)? "March" :(number == 4 )? "Apr"
                    :(number == 5)? "May" :(number == 6)? "June" :(number == 7 )? "July" :(number == 8)? "Aug"
                    :(number == 9)? "Sep" :(number == 10 )? "Oct" :(number == 11)? "Nov" : "Dec";
        }else{
            name = "Invalid";
        }
        System.out.println("name = " + name);













/*
        if( salary >= 60000 && creditScore >= 650){
            result = "Loan Approved";
        }else{
            result = "Loan Denied";
        }

        System.out.println("result = " + result);

*/

    }



}
