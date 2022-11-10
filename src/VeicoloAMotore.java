/**
 *  * La classa fa riferimento ai veicoli a motore
 *  * sono stati implementati getter e setter delle variabili presenti nella classe veicolo a motore
 *  * @author Fabrizio Trupia - Nicola Boniello - Andrea Sciscioli - Alessandro Trupia
 *  * @version 1.5
 */

public class VeicoloAMotore {
    /**
     * La marca del veicolo
     */
    private String marca;

    /**
     * Anno di produzione del veicolo
     */
    private String anno;

    /**
     * cilindrata del veicolo
     */
    private int cilindrata;

    /**
     * Metodo costruttore della classe Veicolo a motore
     * @param marca -> si riferisce alla variabile marca della classe Veicolo a motore
     * @param anno -> si riferisce alla variabile anno della classe Veicolo a motore
     * @param cilindrata -> si riferisce alla variabile cilindrata della classe Veicolo a motore
     */
    public VeicoloAMotore(String marca, String anno, int cilindrata) {
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }

    /**
     * Metodo che ritorna le informazioni dei veicoli a motore (variabile marca, variabile anno, variabile cilindrata)
     * @return
     */
    public String info(){
        return "Marca: " + marca + " Anno " + anno + " Cilindrata: " + cilindrata;
    }


    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public String getAnno() {

        return anno;
    }

    public void setAnno(String anno) {

        this.anno = anno;
    }

    public double getCilindrata() {

        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {

        this.cilindrata = cilindrata;
    }



}
