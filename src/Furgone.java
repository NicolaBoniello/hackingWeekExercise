public class Furgone extends VeicoloAMotore{

    private double capacita;

    public Furgone(String marca, String anno, double cilindrata, double capacità) {
        super(marca, anno, cilindrata);
        this.capacita = capacità;
    }
    @Override
    public String info() {
        return super.info() + " Capacità " + capacita;
    }

    public double getCapacità() {
        return capacita;
    }

    public void setCapacità(double capacità) {
        this.capacita = capacità;
    }


}


