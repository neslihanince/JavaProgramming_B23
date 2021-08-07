package Day19_Loop;

import java.util.Scanner;

public class StringReserve {

    public static void main(String[] args) {

        String name = new Scanner(System.in).nextLine();
        String reverseName = "";

        for(int i = name.length()-1; i >=0; i--){
            reverseName +=name.charAt(i);// getting the characters starting from last index to index 0
        }

        System.out.println(reverseName);

    }
}
