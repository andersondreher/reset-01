package exercicio3;

public class Aluno {

    String nome;

    double nota;

    public Aluno (String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    boolean alunoAprovado(){
        return nota >= 7.0;
    }
}
