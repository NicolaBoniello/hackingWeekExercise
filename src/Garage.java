import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Garage {

    private VeicoloAMotore[] posti = new VeicoloAMotore[15];

    public VeicoloAMotore[] getPosti() {
        return posti;
    }

    public void setPosti(VeicoloAMotore[] posti) {
        this.posti = posti;
    }

    int postiOccupati = 0;
    /** adding a method to add vehicles in garage*/
    public void aggiungiVeicolo(VeicoloAMotore veicoloAMotore){
        if (postiOccupati < posti.length){
            posti[postiOccupati] = veicoloAMotore;
            postiOccupati++;
        } else System.out.println("garage is full");
    }
    public Object rimuoviVeicolo(int veicoloAMotore){
        Arrays.asList(posti).remove(veicoloAMotore);


    }
}
