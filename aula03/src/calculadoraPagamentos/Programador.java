package calculadoraPagamentos;

public class Programador extends Funcionario{

    private int numeroCertificacoes;

    public Programador(String nome, String cpf, double salario, int numeroCertificacoes) {
        super(nome, cpf, salario);
        this.numeroCertificacoes = numeroCertificacoes;
    }

    @Override
    public double getRemuneracaoMensal() {
        return super.getRemuneracaoMensal() + (numeroCertificacoes * 100);
    }
}
