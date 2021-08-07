package Day38_CustomClass.OfferTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MJobOffer {

    public static void main(String[] args) {

        offer offer1 = new offer();
        offer offer2 = new offer();
        offer offer3 = new offer();
        offer offer4 = new offer();
        offer offer5 = new offer();
        offer offer6 = new offer();
        offer offer7 = new offer();

        offer1.setInfo("CA", "Los Angels", "SDET", 120000, true, false, false, true);
        offer2.setInfo("TX", "Austin", "SD", 130000, true, true, true, false  );
        offer3.setInfo("VA", "MCLEAN", "QA", 110000, true, true, true, true );
        offer4.setInfo("NA", "LasVegas", "Scrum Master", 125000, false, false, true, true );
        offer5.setInfo("NC", "Charlote", "SDET", 120000, false, true, true, false );
        offer5.setInfo("WA", "Seattle", "BA", 135000, true, false, true, false );
        offer5.setInfo("CO", "Denver", "QE", 85000, true, true, true, false );

        offer[] arr = {offer1, offer2, offer3, offer4, offer5, offer6, offer7};


        System.out.println("----------------------------------------------------------------------------");
        // add the localOffers
        //ArrayList<offer> localOffers = new ArrayList<>(Arrays.asList(arr));
        //localOffers.removeIf(offer -> !(offer.state.equals("CA") || offer.state.equals("NA")));
        //System.out.println(localOffers.size());

        //System.out.println(localOffers);

        System.out.println("----------------------------------------------------------------------------");
        // only keep the offers that are full-time
        ArrayList<offer> fullTimeOffers = new ArrayList<>(Arrays.asList(arr));

        System.out.println(fullTimeOffers.size());

        System.out.println("----------------------------------------------------------------------------");

        ArrayList<offer> WHFOffers = new ArrayList<>();

        for (offer offer : arr){
            if (offer.WFH && offer.hasPTO){
                WHFOffers.add(offer);
            }
        }

        System.out.println(WHFOffers.size());
        System.out.println(WHFOffers);

        System.out.println("----------------------------------------------------------------------------");

        ArrayList<offer> highSalaryOffers = new ArrayList<>(Arrays.asList(arr));
        highSalaryOffers.removeIf(offer -> offer.salary < 125000);

        System.out.println(highSalaryOffers.size());
        System.out.println(highSalaryOffers);






    }


}
