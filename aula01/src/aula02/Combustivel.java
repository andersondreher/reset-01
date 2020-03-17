package aula02;

public class Combustivel {

    String tipo;

    public Combustivel(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Combustivel{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
