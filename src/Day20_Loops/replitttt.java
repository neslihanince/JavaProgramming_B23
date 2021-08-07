package Day20_Loops;

import java.util.Scanner;

public class replitttt {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String sentence = scan.nextLine();
                int numberOfJava = 0;
                int numberOfPyhton = 0;

                for(int i=0 ; i < sentence.length()-4; i++){
                    String each =sentence.substring(i, i+4);
                    if(each.equals("java")){
                        numberOfJava++;
                    }
                }
                for(int i=0 ; i < sentence.length()-6; i++){
                    String each =sentence.substring(i, i+6);
                    if(each.equals("pyhton")){
                        numberOfPyhton++;
                    }

                }
                boolean appear = numberOfJava == numberOfPyhton;
                System.out.println(appear);

            }
        }

