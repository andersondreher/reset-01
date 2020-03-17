package aula02;

public class VeiculoTerrestre extends Veiculo {

    int quantidadeRodas;

    public VeiculoTerrestre(String nome, Double velocidadeMaxima, int quantidadeRodas) {
        super(nome, velocidadeMaxima, new Terreno("terrestre"));
        this.quantidadeRodas = quantidadeRodas;
    }
}
