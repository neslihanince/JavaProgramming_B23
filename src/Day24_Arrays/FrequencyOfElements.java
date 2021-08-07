package Day24_Arrays;

public class FrequencyOfElements {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4};

        for (int j = 0 ; j < arr.length ; j++) {

            int element = arr[j];
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == element) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(element);
            }
        }

    }
}
