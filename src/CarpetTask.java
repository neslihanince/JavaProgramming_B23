import java.util.ArrayList;
import java.util.Arrays;

class Carpet{

    public  double width, length, unitPrice;
    public boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

    }

    public double calcCost(){
        double totalPrice = (width*length) * unitPrice;
        return (isPersian)? totalPrice+200 : totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= $" + calcCost() +
                '}';
    }


}

public class CarpetTask {

    public static void main(String[] args) {

        Day39_CustomClass.Carpet[] carpets = {new Day39_CustomClass.Carpet(), new Day39_CustomClass.Carpet(), new Day39_CustomClass.Carpet(), new Day39_CustomClass.Carpet(), new Day39_CustomClass.Carpet()};
        carpets[0].customOrder(5, 2, 3.5, false);
        carpets[1].customOrder(4, 3.5, 4.5, false);
        carpets[2].customOrder(6, 1, 6.5, true);
        carpets[3].customOrder(5.5,3.5, 8.5, false);
        carpets[4].customOrder(10, 2, 7.5, true);

        ArrayList<Day39_CustomClass.Carpet> persianCarpets = new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets)); //adding all the carpets
        persianCarpets.removeIf(carpet -> !carpet.isPersian); //remove all the carpets that are not persian

        ArrayList<Day39_CustomClass.Carpet> regularCarpets = new ArrayList<>();
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

        for (Day39_CustomClass.Carpet persianCarpet : persianCarpets){
            System.out.println(persianCarpet);
        }


    }
}
