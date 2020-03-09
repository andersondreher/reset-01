package Exercicio3;

public class App3 {

    public static void main(String[] args) {

        Aluno anderson = new Aluno("Anderson Dreher", 3.5);

        System.out.println("Nome do aluno: " + anderson.nome);
        System.out.println("Com nota final: " + anderson.nota);
        System.out.println("Está aprovado? " + anderson.alunoAprovado());
        System.out.println("--------------------");

        Aluno monica = new Aluno("Mônica Streit", 9.5);

        System.out.println("Nome do aluno: " + monica.nome);
        System.out.println("Com nota final: " + monica.nota);
        System.out.println("Está aprovado? " + monica.alunoAprovado());
        System.out.println("--------------------");

        Aluno marli = new Aluno("Marli Dreher", 9.9);

        System.out.println("Nome do aluno: " + marli.nome);
        System.out.println("Com nota final: " + marli.nota);
        System.out.println("Está aprovado? " + marli.alunoAprovado());
        System.out.println("--------------------");

        Aluno jose = new Aluno("José Dreher", 9.4);

        System.out.println("Nome do aluno: " + jose.nome);
        System.out.println("Com nota final: " + jose.nota);
        System.out.println("Está aprovado? " + jose.alunoAprovado());
    }

}
