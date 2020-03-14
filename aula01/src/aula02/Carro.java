package aula02;

public class Carro extends Veiculo {

    String combustivel;
    int numeroRodas;

    public Carro(String nome, String terreno, Double velocidadeMaxima, int lotacaoMaxima, String combustivel, int numeroRodas) {
        super(nome, terreno, velocidadeMaxima, lotacaoMaxima);
        this.combustivel = combustivel;
        this.numeroRodas = numeroRodas;
    }
}
