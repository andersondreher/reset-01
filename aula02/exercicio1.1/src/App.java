public class App {

    public static void main(String[] args) {
        Aluno a = new Aluno("Nome");
        a.obterNota();
        a.getNome();

        Turma t = new Turma();
        t.obterNome();
        t.obterQuantidadeAlunos();

    }
}