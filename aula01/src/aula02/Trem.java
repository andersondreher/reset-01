package aula02;

public class Trem extends VeiculoTerrestre {

    int lotacaoMaxima;
    Combustivel combustivel;

    public Trem(String nome, double velocidadeMaxima, Combustivel combustivel) {
        super(nome, velocidadeMaxima, 20);
        this.lotacaoMaxima = 150;
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Trem{" +
                "lotacaoMaxima=" + lotacaoMaxima +
                ", combustivel=" + combustivel +
                ", quantidadeRodas=" + quantidadeRodas +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", terreno=" + terreno +
                '}';
    }
}
