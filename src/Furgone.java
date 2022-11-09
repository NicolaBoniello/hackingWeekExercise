public class Furgone extends VeicoloAMotore{

    private double capacità;

    public Furgone(String marca, String anno, double cilindrata, double capacità) {
        super(marca, anno, cilindrata);
        this.capacità = capacità;
    }

    public double getCapacità() {
        return capacità;
    }

    public void setCapacità(double capacità) {
        this.capacità = capacità;
    }

    @Override
    public String info() {
        return super.info() + " Capacità " + capacità;
    }
}


