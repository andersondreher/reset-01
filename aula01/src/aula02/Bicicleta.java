package aula02;

public class Bicicleta extends Veiculo {

    int numeroRodas;

    public Bicicleta(String nome, String terreno, Double velocidadeMaxima, int lotacaoMaxima, int numeroRodas) {
        super(nome, terreno, velocidadeMaxima, lotacaoMaxima);
        this.numeroRodas = numeroRodas;
    }
}
