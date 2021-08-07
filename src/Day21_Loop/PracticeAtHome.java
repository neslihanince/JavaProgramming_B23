package Day21_Loop;

public class PracticeAtHome {

    public static void main(String[] args) {

        String sentence = "mn@#123Ab! ";

        String letters =" ";
        String digits = " ";
        String specialchars =" ";

        for(int i = 0 ; i <= sentence.length()-1; i++){
            char each = sentence.charAt(i);

            if(each>='A' && each <='Z'){
                letters+=each;
            }else if(each >= 'a' && each <='z'){
                letters+=each;
            }else if(each >= '0' && each <='9'){
                digits+=each;
            }else{
                specialchars+=each;
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialchars = " + specialchars);


    }
}
