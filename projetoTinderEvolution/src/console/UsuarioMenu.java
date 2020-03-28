package console;

import dominio.Usuario;
import gerenciador.UsuarioGerenciador;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class UsuarioMenu {

    private UsuarioGerenciador gerenciador;

    public UsuarioMenu() {
        this.gerenciador = new UsuarioGerenciador();
    }

    public void opcoes() {
        Scanner scanner = new Scanner(System.in);
        String opcao = " ";

        while (!opcao.equalsIgnoreCase("X")) {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ C ] Criar");
            System.out.println("[ E ] Editar");
            System.out.println("[ L ] Listar");
            System.out.println("[ P ] Procurar");
            System.out.println("[ D ] Deletar");
            System.out.println("[ X ] Voltar");
            System.out.print("> ");
            opcao = scanner.next();

            switch (opcao.toUpperCase()) {
                case "C":
                    create();
                    break;
                case "E":
                    editar();
                    break;
                case "L":
                    listar();
                    break;
                case "P":
                    procurar();
                    break;
                case "D":
                    deletar();
                    break;
                case "X":
                    System.out.println("...");
                    break;
                default:
                    System.out.println("... opção inválida ...");
            }
        }
    }

    public Usuario create() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCriação de Usuário...");

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("E-mail: ");
        String email = scanner.nextLine();

        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Escreva um pouco sobre você: ");
        String bio = scanner.nextLine();

        System.out.println("Ano de nascimento: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Mês de nascimento: ");
        int mes = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Dia de nascimento: ");
        int dia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Localização - sua latitude é: ");
        double latitude = Double.valueOf(scanner.nextLine());

        System.out.println("Localização - sua longitude é: ");
        double longitude = Double.valueOf(scanner.nextLine());

        Usuario usuario = new Usuario(nome, email, telefone, LocalDate.of(ano, mes, dia), bio, latitude, longitude);
        return gerenciador.salvar(usuario);
    }

    public Usuario editar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEdição de Usuário...");
        System.out.println("Qual usuário deseja editar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios){
            System.out.println("[" + usuario.getId() + "] - " + usuario.getNome());
        }

        System.out.println("> ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("E-mail: ");
        String email = scanner.nextLine();

        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.println("Escreva um pouco sobre você: ");
        String bio = scanner.nextLine();

        System.out.println("Ano de nascimento: ");
        int ano = scanner.nextInt();

        System.out.println("Mês de nascimento: ");
        int mes = scanner.nextInt();

        System.out.println("Dia de nascimento: ");
        int dia = scanner.nextInt();

        System.out.println("Localização - sua latitude é: ");
        double latitude = scanner.nextDouble();

        System.out.println("Localização - sua longitude é: ");
        double longitude = scanner.nextDouble();

        Usuario atualizacao = new Usuario(nome, email, telefone, LocalDate.of(ano, mes, dia), bio, latitude, longitude);

        Usuario usuarioAtualizado = gerenciador.editar(id, atualizacao);

        if(usuarioAtualizado == null){
            System.out.println("Usuário não encontrado.");
        }
        else {
            System.out.println(usuarioAtualizado);
        }

        return usuarioAtualizado;
    }

    private List<Usuario> listar() {

        System.out.println("\nLista de usuários...");
        List<Usuario> usuarios = gerenciador.listar();

        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }

        return usuarios;
    }

    private void procurar(){

        Scanner scanner = new Scanner((System.in));
        System.out.println("\nPesquisa de usuário...");
        System.out.println("Qual o código do usuário?");

        System.out.println("> ");
        int id = scanner.nextInt();

        Usuario usuario = gerenciador.procurar(id);

        if(usuario == null){
            System.out.println("Usuário não encontrado.");
        }
        else{
            System.out.println(usuario);
        }
    }

    private void deletar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nExclusão de usuário...");
        System.out.println("Qual usuário deseja deletar?");

        List<Usuario> usuarios = gerenciador.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[" + usuario.getId() + "] - " + usuario.getNome());
        }

        System.out.println("> ");
        int id = scanner.nextInt();

        if (gerenciador.deletar(id)) {
            System.out.println("Usuário deletado.");
        }
        else {
            System.out.println("Usuário não encontrado.");
        }
    }
}

