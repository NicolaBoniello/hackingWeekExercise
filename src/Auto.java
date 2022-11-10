public class Auto extends VeicoloAMotore{

    private int porte;
    private String alimentazione;

    public Auto(String marca, String anno, double cilindrata, int porte, String alimentazione) {
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }
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
