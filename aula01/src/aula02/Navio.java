package aula02;

public class Navio extends Veiculo {

    String combustivel;

    public Navio(String nome, String terreno, Double velocidadeMaxima, int lotacaoMaxima, String combustivel) {
        super(nome, terreno, velocidadeMaxima, lotacaoMaxima);
        this.combustivel = combustivel;
    }
}
