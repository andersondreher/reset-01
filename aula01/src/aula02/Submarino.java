package aula02;

public class Submarino extends Veiculo {

    String combustivel;
    double profundidadeMaxima;

    public Submarino(String nome, String terreno, Double velocidadeMaxima, int lotacaoMaxima,String combustivel, double profundidadeMaxima) {
        super(nome, terreno, velocidadeMaxima, lotacaoMaxima);
        this.combustivel = combustivel;
        this.profundidadeMaxima = profundidadeMaxima;
    }
}
