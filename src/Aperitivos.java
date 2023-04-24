public class Aperitivos extends Alimento{

    //declaração dos atributos
    private boolean snack;
    private boolean saudavel;
    private boolean vegano;
    private double porcSal;

    //criação dos contrutores

    public Aperitivos(int calorias, String nome, double precoKg, boolean snack, boolean saudavel, boolean vegano, double porcSal) {
        super(calorias, nome, precoKg);
        this.snack = snack;
        this.saudavel = saudavel;
        this.vegano = vegano;
        this.porcSal = porcSal;
    }

    public Aperitivos(int calorias, String nome, double precoKg, boolean snack, boolean saudavel, boolean vegano) {
        super(calorias, nome, precoKg);
        this.snack = snack;
        this.saudavel = saudavel;
        this.vegano = vegano;
    }

    //criação dos getters, não precisa de setters esse atributos
    public double getPorcSal() {
        return porcSal;
    }

    public boolean isSnack() {
        return snack;
    }

    public boolean isSaudavel() {
        return saudavel;
    }

    public boolean isVegano() {
        return vegano;
    }

    //criação dos métodos

    public boolean recomendado(){
        if (this.snack == true && this.vegano == true && this.saudavel == true){
            return true;
        } else if (this.saudavel == false) {
            return false;
        } else if (this.snack == false && this.vegano == false) {
            return false;
        }else{
            return true;
        }
    }

    public boolean recomendado(double preco){
        if (this.snack == true && this.vegano == true && this.saudavel == true && preco < 300){
            return true;
        } else if (this.saudavel == false && preco < 50) {
            return false;
        } else if (this.snack == false && this.vegano == false && preco < 10) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "snack=" + snack + '\'' +
                "saudavel=" + saudavel + '\'' +
                "vegano=" + vegano + '\'' +
                "porcSal=" + porcSal;
    }
}
