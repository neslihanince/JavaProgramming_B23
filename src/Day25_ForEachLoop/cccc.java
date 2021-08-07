package Day25_ForEachLoop;

import java.util.Scanner;

public class cccc {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        // Do not touch abov
        String min = " ";
        for(int i = 0; i < str.length; i++){
            if(str[i].length() < min.length()){
                min = str[i];
                System.out.println(min);
            }
        }




    }
    }

