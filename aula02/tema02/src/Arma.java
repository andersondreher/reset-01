public class Arma {

    private String nome;
    private double poderDeAtaque;

    public Arma(String nome, double poderDeAtaque) {
        this.nome = nome;
        this.poderDeAtaque = poderDeAtaque;
    }

    public String getNome() {
        return nome;
    }

    public double getPoderDeAtaque() {
        return poderDeAtaque;
    }
}