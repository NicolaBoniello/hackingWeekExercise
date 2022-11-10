import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
/**
 *
 * In questa classe è stata creata una lista privata
 * con il metodo aggiungiVeicolo viene aggiunto un oggetto di tipo VeicoloAMotore alla lista
 * con il metodo rimuoviVeicolo viene prelevato dalla lista e ritorna l'istanza del veicolo
 * sono stati implementati getter e setter
 * @author Fabrizio Trupia - Nicola Boniello - Andrea Sciscioli - Alessandro Trupia
 * @version 1.5
 */
public class Garage {


    private int postiOccupati = 0;

    private ArrayList<VeicoloAMotore> posti = new ArrayList<>();

    public void aggiungiVeicolo(VeicoloAMotore veicoloAMotore){
        if (postiOccupati < 15){
            posti.add(veicoloAMotore);
            postiOccupati++;
        } else System.out.println("Il garage non ha posti");
    }

    public VeicoloAMotore rimuoviVeicolo(int veicoloAMotore){
        System.out.println("veicolo " + veicoloAMotore + " e stato prelevato");
        return posti.remove(veicoloAMotore);
    }

    public void setPosti(ArrayList<VeicoloAMotore> posti) {
        this.posti = posti;
    }

    public ArrayList<VeicoloAMotore> getPosti() {
        return posti;
    }

    public int getPostiOccupati() {
        return postiOccupati;
    }

    public void setPostiOccupati(int postiOccupati) {
        this.postiOccupati = postiOccupati;
    }
}