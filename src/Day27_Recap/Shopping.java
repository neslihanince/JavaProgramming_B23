package Day27_Recap;

public class Shopping {

    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad", "Iphone 12 case"};
        double[] prices = {99.99,    150.0,    9.99,     250.0,     439.50,    39.99};
        int[]  itemIDs = {12345,      12346,     12347,      12348,      12349,     12350};

        // find out the first index of "Gloves" ( for loop)

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")){
                System.out.println(i);
                System.out.println(i + " price of gloves is: " + prices[i]);
                break;
            }

        }

        // find out if 'ipad' is containned in the item list (for loop or foe each)

        boolean hasIpad = false;
        for (String eachItem : items) {
            hasIpad = true;
        }


        System.out.println("hasIpad = " + hasIpad);

        System.out.println("-------------------------------------------");

        // Print a report of each shopping item(for loop)


    }


}
