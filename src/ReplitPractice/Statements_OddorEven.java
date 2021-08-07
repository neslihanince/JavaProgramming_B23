package ReplitPractice;

import java.util.Scanner;

public class Statements_OddorEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");

        int number = scan.nextInt();

        if (number%2==0){
            System.out.println(number + " is even");
        }else if(number%2 !=0){
            System.out.println(number + " is odd");
        }else{
            System.out.println("Invalid Number");
        }
    }
}
/*
Using conditional statements, check if number is odd or even. Please follow the below examples and print message accordingly:

```
Enter a number:
10

10 is even
```

```
Enter a number:
33

33 is odd
```

```
Enter a number:
0

0 is even
```

 */