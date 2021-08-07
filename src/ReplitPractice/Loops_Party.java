package ReplitPractice;

import java.util.Scanner;

public class Loops_Party {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String guest = scan.nextLine();

        String list = scan.nextLine();

        String respond = scan.next();

        System.out.println("Please enter guest name:");

        for (int i = 0 ; i >= 0 ; i++){
            System.out.println("Do you want to enter new guest name:");
            respond= scan.next();
            if(respond.contains("yes")){
                System.out.println("Please enter guest name:");
                String guest2 = scan.nextLine();
                list = list + guest2 + ",";

            }else if (respond.contains("no")){
                break;
            }
        }

        System.out.println("Guest's list: "+ guest + ", " + list);



    }

}
/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

Ask for the first guest name.

Then ask does user want to enter one more guests.

 If yes - take the next guest input

If not - finish the program and print list of the guests.

Example:

```
Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no
Guest's list: Nick, Linda
```
 */