package aula02;

public class VeiculoAereo extends Veiculo {

    double altitudeMaxima;

    public VeiculoAereo(String nome, double velocidadeMaxima, double altitudeMaxima) {
        super(nome, velocidadeMaxima, new Terreno("aéreo"));
        this.altitudeMaxima = altitudeMaxima;
    }
}


