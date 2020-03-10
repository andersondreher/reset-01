package exercicio3;

public class App3 {

    public static void main(String[] args) {

        Aluno anderson = new Aluno("Anderson Dreher", 3.5);

        System.out.println("Nome do aluno: " + anderson.nome);
        System.out.println("Nota final: " + anderson.nota);
        System.out.println("O aluno foi aprovado? " + anderson.alunoAprovado());
        System.out.println("--------------------");

        Aluno monica = new Aluno("Mônica Streit", 9.5);

        System.out.println("Nome do aluno: " + monica.nome);
        System.out.println("Nota final: " + monica.nota);
        System.out.println("O aluno foi aprovado? " + monica.alunoAprovado());
        System.out.println("--------------------");

        Aluno marli = new Aluno("Marli Dreher", 9.9);

        System.out.println("Nome do aluno: " + marli.nome);
        System.out.println("Nota final: " + marli.nota);
        System.out.println("O aluno foi aprovado? " + marli.alunoAprovado());
        System.out.println("--------------------");

        Aluno jose = new Aluno("José Dreher", 9.4);

        System.out.println("Nome do aluno: " + jose.nome);
        System.out.println("Nota final: " + jose.nota);
        System.out.println("O aluno foi aprovado? " + jose.alunoAprovado());

    }

}
