package exercicio3;

public class Produto {

    private String nome;
    private double valor;
    private int quantidade;
    private Segmento segmento;

    public Produto(String nome, double valor, int quantidade, Segmento segmento) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.segmento = segmento;

    }
}
