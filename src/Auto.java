/**
 * La classa auto estende la classe veicoli a motore
 * sono stati implementati i metodi getter e setter delle variabili presenti nella classe auto
 * @author Fabrizio Trupia - Nicola Boniello - Andrea Sciscioli - Alessandro Trupia
 * @version 1.5
 */
public class Auto extends VeicoloAMotore{

    /**
     *  numero di porte
     */
    private int porte;

    /**
     * alimentazione dell'auto
     */
    private String alimentazione;

    /**
     * metodo costruttore della zlasse Auto
     * @param marca -> si riferisce alla variabile marca della classe padre Veicolo a motore
     * @param anno-> si riferisce alla variabile anno della classe padre Veicolo a motore
     * @param cilindrata -> si riferisce alla variabile cilindrata della classe padre Veicolo a motore
     * @param porte -> si riferisce alla variabile porte della classe Auto
     * @param alimentazione -> si riferisce alla variabile alimentazione della classe Auto
     */
    public Auto(String marca, String anno, int cilindrata, int porte, String alimentazione) {
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

    /**
     *  Metodo info
     *  @return che ritorna con il super.info le informazioni del metodo info della classa padre più le variabili porte e alimentazione
     */
    @Override
    public String info() {
        return super.info() + " Numero porte: " + porte + " Alimentazione " + alimentazione;
    }

    public int getPorte() {

        return porte;
    }

    public void setPorte(int porte) {

        this.porte = porte;
    }

    public String getAlimentazione() {

        return alimentazione;
    }

    public void setAlimentazione(String alimentazione) {

        this.alimentazione = alimentazione;
    }
}
