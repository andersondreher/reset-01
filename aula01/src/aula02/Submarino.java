package aula02;

public class Submarino extends VeiculoAquatico {

    int lotacaoMaxima;
    double profundidadeMaxima;
    Combustivel combustivel;

    public Submarino(String nome, double velocidadeMaxima, double profundidadeMaxima, Combustivel combustivel) {
        super(nome, velocidadeMaxima);
        this.lotacaoMaxima = 2200;
        this.profundidadeMaxima = profundidadeMaxima;
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Submarino{" +
                "lotacaoMaxima=" + lotacaoMaxima +
                ", profundidadeMaxima=" + profundidadeMaxima +
                ", combustivel=" + combustivel +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno=" + terreno +
                '}';
    }
}
