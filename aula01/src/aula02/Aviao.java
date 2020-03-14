package aula02;

public class Aviao extends Veiculo {

    String combustivel;
    int numeroRodas;
    double altitudeMaxima;

    public Aviao(String nome, String terreno, Double velocidadeMaxima, int lotacaoMaxima, String combustivel, double altitudeMaxima, int numeroRodas) {
        super(nome, terreno, velocidadeMaxima, lotacaoMaxima);
        this.altitudeMaxima = altitudeMaxima;
        this.combustivel = combustivel;
        this.numeroRodas = numeroRodas;
    }
}
