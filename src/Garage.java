import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<VeicoloAMotore> posti = new ArrayList<>();

   /* public Garage(List<VeicoloAMotore> posti) {
        this.posti = posti;
    }*/

    public List<VeicoloAMotore> getPosti() {
        return posti;
    }

    public void setPosti(List<VeicoloAMotore> posti) {
        this.posti = posti;
    }

    public void aggiungiVeicolo(VeicoloAMotore veicoloAMotore){
        posti.add(veicoloAMotore);
    }

    public void rimuoviVeicolo(VeicoloAMotore veicoloAMotore){
        posti.remove(veicoloAMotore);
    }
}
