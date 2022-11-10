/**
 * La classa moto estende la classe veicoli a motore
 * sono stati implementati i metodi getter e setter delle variabili presenti nella classe moto
 * @author Fabrizio Trupia - Nicola Boniello - Andrea Sciscioli - Alessandro Trupia
 * @version 1.5
 */

public class Moto extends VeicoloAMotore{

    /**
     * numero dei tempi
     */
    private int tempi;

    /**
     * Metodo costruttore della classe Moto
     * @param marca -> si riferisce alla variabile marca della classe padre Veicolo a motore
     * @param anno -> si riferisce alla variabile anno della classe padre Veicolo a motore
     * @param cilindrata -> si riferisce alla variabile cilindrata della classe padre Veicolo a motore
     * @param tempi -> si riferisce alla variabile tempi della classe moto
     */
    public Moto(String marca, String anno, int cilindrata, int tempi) {
        super(marca, anno, cilindrata);
        this.tempi = tempi;
    }

    /**
     *  Metodo info
     *  @return che ritorna con il super.info le informazioni del metodo info della classa padre più la variabile tempi
     */
    @Override
    public String info() {
        return super.info() + " Tempi: " + tempi;
    }

    public int getTempi() {

        return tempi;
    }

    public void setTempi(int tempi) {

        this.tempi = tempi;
    }
}
