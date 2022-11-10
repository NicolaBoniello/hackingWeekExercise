/**
   * La classa furgone estende la classe veicoli a motore
   * sono stati implementati i metodi getter e setter delle variabili presenti nella classe furgone
   * @author Fabrizio Trupia - Nicola Boniello - Andrea Sciscioli - Alessandro Trupia
   * @version 1.5
 */
public class Furgone extends VeicoloAMotore{

    /**
     * capacità massima di trasporto del furgone, espresso in tonnellate
     */
    private double capacita;

    /**
     * Metodo costruttore della classe furgone
     * @param marca -> si riferisce alla variabile marca della classe padre Veicolo a motore
     * @param anno -> si riferisce alla variabile anno della classe padre Veicolo a motore
     * @param cilindrata -> si riferisce alla variabile cilindrata della classe padre Veicolo a motore
     * @param capacità -> si riferisce alla variabile capacità della classe Furgone
     */
    public Furgone(String marca, String anno, int cilindrata, double capacità) {
        super(marca, anno, cilindrata);
        this.capacita = capacità;
    }

    /**
     * Metodo info
     * @return che ritorna con il super.info le informazioni del metodo info della classa padre più la variabile capacità
     */
    @Override
    public String info() {
        return super.info() + " Capacità " + capacita + " tonnellate";
    }

    public double getCapacità() {
        return capacita;
    }

    public void setCapacità(double capacità) {
        this.capacita = capacità;
    }


}


