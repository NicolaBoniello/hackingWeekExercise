import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garage {

    public VeicoloAMotore[] posti = new VeicoloAMotore[15];


    int postiOccupati = 0;
    /** adding a method to add vehicles in garage*/
    public void aggiungiVeicolo(VeicoloAMotore veicoloAMotore){
        if (postiOccupati < posti.length){
            posti[postiOccupati] = veicoloAMotore;
            postiOccupati++;
        } else System.out.println("garage is full");
    }
    public void rimuoviVeicolo(VeicoloAMotore veicoloAMotore){
        Arrays.stream(posti).toList().remove(veicoloAMotore);
    }
}
