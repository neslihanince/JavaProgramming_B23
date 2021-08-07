package ReplitPractice;

import java.util.Scanner;

public class Statements_Nums {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1 == num2){
            System.out.println(num1 + " and " + num2 + " are equal");
        }else if (num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        }else if (num1 < num2){
            System.out.println(num2 + " is greater than " + num1);
        }else{
            System.out.println("Invalid");
        }

    }
}
/*
You have two numbers already declared and assigned values.

Check if num1 and num2 are equal, or not. Please follow the below examples and print message accordingly:

```
Enter 2 numbers:
10
10

10 and 10 are equal
```

```
Enter 2 numbers:
100
55

100 is greater than 55
```

```
Enter 2 numbers:
33
333

333 is greater than 33
```
 */