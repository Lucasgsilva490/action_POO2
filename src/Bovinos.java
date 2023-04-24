public class Bovinos extends Alimento{
    //declaração dos atributos
    private double porcGordura;
    private boolean salgada;
    private boolean macia;

    //criação dos contrutores
    public Bovinos(int calorias, String nome, double precoKg, double porcGordura, boolean salgada, boolean macia) {
        super(calorias, nome, precoKg);
        this.porcGordura = porcGordura;
        this.salgada = salgada;
        this.macia = macia;
    }

    public Bovinos(int calorias, String nome, double precoKg, double porcGordura) {
        super(calorias, nome, precoKg);
        this.porcGordura = porcGordura;
    }

    //criação dos getters, não precisa de setters esse atributos
    public double getPorcGordura() {
        return porcGordura;
    }

    public boolean isSalgada() {
        return salgada;
    }

    public boolean isMacia() {
        return macia;
    }

    //criação dos métodos
    
    public boolean benefico(boolean toxica){
        if (toxica == true){
            return false;
        } else if (this.porcGordura > 50) {
            return false;
        } else if (this.macia == true && this.salgada == false) {
            return true;
        }else{
            return false;
        }
    }

    public boolean benefico(){
        if (this.porcGordura > 40) {
            return false;
        } else if (this.macia == true && this.salgada == false) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "porcGordura=" + porcGordura + '\'' +
                " salgada=" + salgada + '\'' +
                " macia=" + macia;
    }
}
