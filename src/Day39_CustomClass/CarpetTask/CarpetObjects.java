package Day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {

    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(5, 2, 3.5, false);
        carpets[1].customOrder(4, 3.5, 4.5, false);
        carpets[2].customOrder(6, 1, 6.5, true);
        carpets[3].customOrder(5.5,3.5, 8.5, false);
        carpets[4].customOrder(10, 2, 7.5, true);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets)); //adding all the carpets
        persianCarpets.removeIf(carpet -> !carpet.isPersian); //remove all the carpets that are not persian

        ArrayList<Carpet> regularCarpets = new ArrayList<>();
        regularCarpets.removeIf(p -> p.isPersian); //remove all the carpets that are

        /*for (Carpet each : carpets){
            if (each.isPersian){
                persianCarpets.add(each);
            }else{
                regularCarpets.add(each);
            }
        }*/

        System.out.println("Total number of persian carpets: " + persianCarpets.size());
        System.out.println("Total number of regular carptes: " + regularCarpets.size());

        for (Carpet persianCarpet : persianCarpets){
            System.out.println(persianCarpet);
        }


    }
}
