package ReplitPractice;

import java.util.Scanner;

public class Loops_CatAndDog {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        int countOfDog = 0;
        int countOfCat= 0;

        for (int i = 0; i<=word.length()-3 ; i++){
            String result = word.substring(i, i+3);
            if(result.equals("cat")){
                countOfCat++;
            }
            if(result.equals("dog")){
                countOfDog++;
            }

        }

        System.out.println(countOfDog == countOfCat);


    }
}
/*
Print true if the string _"cat"_ and _"dog"_ appear the same number of times in the given string _word_.


Example:

```
input: catdog
output: true
```

Example:

```
input: catcat
output: false
```

Example:

```
input: cat-cheetah-dog-cat
output: false
```
 */