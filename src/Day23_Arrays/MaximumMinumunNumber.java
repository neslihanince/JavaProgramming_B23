package Day23_Arrays;

public class MaximumMinumunNumber {

    public static void main(String[] args) {


        int[] numbers = {10, 5, 4, 400, 50, 0, -1};
        int max = numbers[0];
        int min = numbers[0];
        for(int i = 0 ; i <= numbers.length-1 ; i++){

            int each = numbers[i];
            if(each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }

        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
