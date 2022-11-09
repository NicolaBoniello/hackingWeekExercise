public class Moto extends VeicoloAMotore{

    private int tempi;

    public Moto(String marca, String anno, double cilindrata, int tempi) {
        super(marca, anno, cilindrata);
        this.tempi = tempi;
    }

    public int getTempi() {
        return tempi;
    }

    public void setTempi(int tempi) {
        this.tempi = tempi;
    }

    @Override
    public String info() {
        return super.info() + " Tempi: " + tempi;
    }
}
