package aula02;

public class Navio extends VeiculoAquatico {

    int lotacaoMaxima;
    Combustivel combustivel;

    public Navio(String nome, double velocidadeMaxima, Combustivel combustivel) {
        super(nome, velocidadeMaxima);
        this.lotacaoMaxima = 2500;
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Navio{" +
                "lotacaoMaxima=" + lotacaoMaxima +
                ", combustivel=" + combustivel +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno=" + terreno +
                '}';
    }
}
