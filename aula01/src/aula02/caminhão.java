package aula02;

public class caminhão extends Veiculo {

    String combustivel;
    int numeroRodas;

    public caminhão(String nome, String terreno, Double velocidadeMaxima, int lotacaoMaxima, String combustivel, int numeroRodas) {
        super(nome, terreno, velocidadeMaxima, lotacaoMaxima);
        this.combustivel = combustivel;
        this.numeroRodas = numeroRodas;
    }
}
