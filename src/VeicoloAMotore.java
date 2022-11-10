public class VeicoloAMotore {

    private String marca;
    private String anno;
    private double cilindrata;

    public VeicoloAMotore(String marca, String anno, double cilindrata) {
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }
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

    public void setCilindrata(double cilindrata) {

        this.cilindrata = cilindrata;
    }



}
