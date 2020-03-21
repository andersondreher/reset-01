public abstract class Magia extends Poder{

    private double poder;
    private double custoDeMana;

    public Magia(String nome, double poder, double custoDeMana) {
        super(nome);
        this.poder = poder;
        this.custoDeMana = custoDeMana;
    }

    public double getPoder() {
        return poder;
    }

    public double getCustoDeMana() {
        return custoDeMana;
    }
}