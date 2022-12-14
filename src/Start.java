/**
 * In questa classe sono state create delle istanze di oggetti nelle varie classi e aggiunti alla lista
 *  con il metodo aggiungi veicolo vengono aggiunti i veicoli alla lista
 *  con il metodo rimuovi veicolo vengono rimossi i veicoli dalla lista
 * La classe che fa riferimento al main
 * @author Fabrizio Trupia , Alessandro Trupia , Nicola Boniello , Andrea Sciscioli
 * @version 1
 */

public class Start {
    public static void main(String[] args) {

        VeicoloAMotore auto1 = new Auto("Audi", "2014", 1400, 5, "Diesel");
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

        /**
         * Ciclo for each per stampare tutti gli elementi della lista
         */
        for (VeicoloAMotore posti : garage.getPosti()){
            System.out.println(posti.info());
        }

        System.out.println("posti liberi = " + (15 - garage.getPostiOccupati()));

        System.out.println("-------------------------------------------------------------");

        System.out.println(garage.rimuoviVeicolo(2).info());
    }
}
