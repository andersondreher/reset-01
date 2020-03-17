package exercicio1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class App {

    public static void main(String[] args) {
        Aluno a = new Aluno("Nome");
        a.obterNota();
        a.getNome();

        Turma t = new Turma();
        t.obterNome();
        t.obterQuantidadeDeAlunos();

    }
}
