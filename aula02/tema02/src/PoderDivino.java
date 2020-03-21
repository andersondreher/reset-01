public abstract class PoderDivino extends  Poder{

    private double intensidade;
    private double custoDeFe;


    public PoderDivino(String nome, double intensidade, double custoDeFe) {
        super(nome);
        this.intensidade = intensidade;
        this.custoDeFe = custoDeFe;
    }

    public double getIntensidade() {
        return intensidade;
    }

    public double getCustoDeFe() {
        return custoDeFe;
    }
}