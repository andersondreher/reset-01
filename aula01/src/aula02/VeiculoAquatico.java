package aula02;

public class VeiculoAquatico extends Veiculo {

    public VeiculoAquatico(String nome, double velocidadeMaxima) {
        super(nome, velocidadeMaxima, new Terreno("áquatico"));
    }
}
