import java.util.Arrays;

public class Start {
    public static void main(String[] args) {

        VeicoloAMotore auto1 = new Auto("Audi", "2014", 14000, 5, "Diesel");
        VeicoloAMotore auto2 = new Auto("BMW", "2016", 1800, 3, "Benzina");
        VeicoloAMotore moto1 = new Moto("Kawasaki", "2018", 1100, 5);
        VeicoloAMotore moto2 = new Moto("BMW", "2019", 750, 5);
        VeicoloAMotore furgone1 = new Furgone("Fiat", "2014", 1600 , 3.5);
        VeicoloAMotore furgone2 = new Furgone("Ducato", "2018", 1900, 2.8);

        Garage garage = new Garage();
        garage.aggiungiVeicolo(auto1);
        garage.aggiungiVeicolo(auto2);
        garage.aggiungiVeicolo(moto1);
        garage.aggiungiVeicolo(moto2);
        garage.aggiungiVeicolo(furgone1);
        garage.aggiungiVeicolo(furgone2);

        /**adding print info about garage method*/

        for (VeicoloAMotore posti : garage.getPosti()){
            try {
                System.out.println(posti.info());
            } catch (Exception e) {
                System.out.println("the other " + (15 - garage.postiOccupati) + " places are empty");
                break;
            }
        }

    }
}
