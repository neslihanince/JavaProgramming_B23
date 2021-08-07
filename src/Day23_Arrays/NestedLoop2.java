package Day23_Arrays;

public class NestedLoop2 {

    public static void main(String[] args) {


        for (int j = 1 ; j<= 6 ; j++){
        for (int i = 0; i < 20 ; i++) {
            System.out.print("*");
        }
            System.out.println();
        }


        System.out.println("--------------------------------------");

        for (int j = 1; j <= 8; j++){
            for (int i = 1 ; i <= j ; i++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
