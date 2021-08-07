package Day23_Arrays;

public class MyClassMates {

    public static void main(String[] args) {

        String[] friends = {"Sabit" , "Ahmet" , "Tugba" , "Beryl" , "Ahmet" , "Zulal"};
        System.out.println("Size: " + friends.length);

        for (int i=0; i <= friends.length-1; i++){
            System.out.println(friends[i]);
        }

        String[] friends2 = new String[5];
        System.out.println("Size: " + friends2.length);

        friends2[0]= "Dilem";
        friends2[1]= "Mohammed";
        friends2[2]= "Komil";
        friends2[3]= "Esra";
        friends2[4]= "Kemal";

        for (int i=0; i <= friends2.length-1; i++){
            System.out.println(friends2[i]);
        }


    }
}
