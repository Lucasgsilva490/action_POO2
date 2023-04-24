public class Alimento {

    //declaração dos atributos
    private int calorias;
    private String nome;
    private double precoKg;


//criação dos contrutores
    public Alimento(int calorias, String nome, double precoKg) {
        this.calorias = calorias;
        this.nome = nome;
        this.precoKg = precoKg;
    }
    public Alimento(int calorias, String nome) {
        this.calorias = calorias;
        this.nome = nome;
        this.precoKg = precoKg;
       }

    //criação dos getters e setters
    public int getCalorias() {
        return calorias;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoKg() {
        return precoKg;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(int precoKg) {
        this.precoKg = precoKg;
    }

    //criação dos métodos
    public double calcularPreco(double pesoKg){
        double precoFinal;
        precoFinal = this.precoKg * pesoKg;
        return precoFinal;
    }

    public double calcularPreco(double pesoKg, boolean vencido){
        double precoFinal;
        precoFinal = this.precoKg * pesoKg;
        if (vencido == true){
            precoFinal = precoFinal * 0.5;
            return precoFinal;
        }else {
            return precoFinal;
        }
    }

    @Override
    public String toString() {
        return "calorias=" + calorias + '\'' +
                "nome=" + nome + '\'' +
                "precoKg=" + precoKg;
    }
}
