package ReplitPractice;

import java.util.Scanner;

public class String_FindTheLength {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the text:");

        String txt = scan.nextLine();

        System.out.println("Length is: " + txt.length());



    }
}
/*
Write a program that will output length of the text (string).

Example:


```
Display message: "Please enter the text:"
```

```
input: java
```

```
Display message: "Length is: 4"
 */