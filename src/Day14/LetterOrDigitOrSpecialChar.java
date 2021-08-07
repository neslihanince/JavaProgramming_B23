package Day14;

public class LetterOrDigitOrSpecialChar {

    public static void main(String[] args) {

        char ch = 'b';

        boolean isDigit = ch >= 48 && ch <=57;
        boolean isLetter= ( ch >= 'A' && ch <= 'Z' ) || (ch >= 'a' && ch <= 'z');

        //boolean isSpecialCharacter =  !isDigit && !isLetter;


       /* if(isDigit){
            System.out.println("Digit");
        }else if (isLetter){
            System.out.println("Letter");
        }else{
            System.out.println("Special Character");
        } */

        String result = (isDigit) ? ch + "is digit" :(isLetter)? ch + "is letter" : ch + "is special character";
    }


}
