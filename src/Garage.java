import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Garage {

    private ArrayList<VeicoloAMotore> posti = new ArrayList<>();

    public ArrayList<VeicoloAMotore> getPosti() {
        return posti;
    }

    public void setPosti(ArrayList posti) {
        this.posti = posti;
    }

    int postiOccupati = 0;
    /** adding a method to add vehicles in garage*/
    public void aggiungiVeicolo(VeicoloAMotore veicoloAMotore){
        if (postiOccupati < 15){
            posti.add(veicoloAMotore);
            postiOccupati++;
        } else System.out.println("garage is full");
    }
    public VeicoloAMotore rimuoviVeicolo(int veicoloAMotore){
        System.out.println("veicolo " + veicoloAMotore + " e stato prelevato");
        return posti.remove(veicoloAMotore);
    }
}
