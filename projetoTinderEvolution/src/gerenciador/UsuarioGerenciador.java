package gerenciador;

import acervo.UsuarioAcervo;
import dominio.Musica;
import dominio.Usuario;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class UsuarioGerenciador {

    private UsuarioAcervo acervo = new UsuarioAcervo();

    public Usuario salvar(Usuario usuario) {

        List<Usuario> usuarios = acervo.listar();

        for (Usuario usuarioExistente : usuarios) {
            if (usuario.getEmail().equals(usuarioExistente.getEmail())) {
                System.out.println("O e-mail cadastrado ja existe!");             //NÃO ESTÁ IMPRIMINDO
                return usuarioExistente;
            }
        }                                                                                 // ver sobre a latitude e longitude

        if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getTelefone().isEmpty() || usuario.getNascimento() == null || usuario.getBio().isEmpty()) {
            System.out.println("Campos obrigatórios não informado!");
            return null;
        }

        if (calcularIdade(usuario.getNascimento()) < 18) {
            System.out.println("Usuário deve ter idade igual ou maior a 18 anos!");
            return null;
        }

        return acervo.salvar(usuario);
    }

    public Usuario editar(int id, Usuario usuarioAtualizado) {

        Usuario usuarioParaEditar = procurar(id);

        if (usuarioParaEditar == null) {
            return null;
        } else {
            return acervo.editar(usuarioParaEditar, usuarioAtualizado);
        }
    }

    public List<Usuario> listar() {
        return acervo.listar();
    }

    public Usuario procurar(int id) {

        if (id > 0) {
            return acervo.procurar(id);
        }

        return null;
    }

    public boolean deletar(int id) {

        if (id > 0) {
            return acervo.deletar(id);
        }

        return false;
    }

    private double calcularIdade(LocalDate nascimento) {
        Period anos = Period.between(nascimento, LocalDate.now());
        double idade = anos.getYears();
        return idade;
    }
}

