package Day21_Loop;

public class practice {

    public static void main(String[] args) {

        String str = "A4B63C";
        int sum = 0;

        for (int i = 0; i<=str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch>= '0' && ch<= '9'){
                sum+=ch-49;
            }
        }
        System.out.println("sum = " + sum);
        
    }
}
