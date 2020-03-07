package Exercicio3;

public class App3 {

    public static void main(String[] args) {

        NomeAluno nomeDeAluno = new NomeAluno();
        String identificacao = nomeDeAluno.nomeDoAluno("Anderson");
        System.out.println("Nome do Aluno : " + identificacao);

        float notaFinalDoAluno = nomeDeAluno.notaDoAluno(9.0);
        System.out.println("Nota do Aluno: " + notaFinalDoAluno);

        boolean alunoAprovado = nomeDeAluno.menorQue(7);
        System.out.println("Aluno Aprovado: " + alun);

    }

}
