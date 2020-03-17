package aula02;

public class Carro extends VeiculoTerrestre {

    int lotacaoMaxima;
    Combustivel combustivel;

    public Carro(String nome, double velocidadeMaxima, Combustivel combustivel) {
        super(nome, velocidadeMaxima, 4);
        this.lotacaoMaxima = 5;
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "lotacaoMaxima=" + lotacaoMaxima +
                ", combustivel=" + combustivel +
                ", quantidadeRodas=" + quantidadeRodas +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno=" + terreno +
                '}';
    }
}
