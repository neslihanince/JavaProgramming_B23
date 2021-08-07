package Day20_Loops;

public class booleanAppear {

    public static void main(String[] args) {

        String sentence = "Cat Dog Dog Cat Cat Cat Cat  ";

        int numberOfCats = 0;
        int numberOfDogs = 0;

        for (int i = 0; i <= sentence.length()-3; i++){
            String each = sentence.substring(i, i+3);
            if (each.equals("Cat")) {
                numberOfCats++;
            }
        }

        System.out.println("numberOfCats = " + numberOfCats);


        for (int i = 0; i <= sentence.length()-3; i++){
            String each = sentence.substring(i, i+3);
            if (each.equals("Dog")) {
                numberOfDogs++;
            }
        }
        System.out.println("numberOfDogs = " + numberOfDogs);


        boolean equal = numberOfCats == numberOfDogs;

        System.out.println(equal);



    }
}
