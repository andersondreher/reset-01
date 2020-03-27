package console;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        UsuarioMenu usuarioMenu = new UsuarioMenu();
        MusicaMenu musicaMenu = new MusicaMenu();

        Scanner scanner = new Scanner(System.in);
        String opcao = " ";

        while (opcao.toUpperCase() != "X") {

            System.out.println("\nSelecione uma opção");
            System.out.println("[ U ] Usuários");
            System.out.println("[ M ] Músicas");
            System.out.println("[ X ] Encerrar");
            System.out.print("> ");
            opcao = scanner.next();

            switch (opcao.toUpperCase()) {
                case "U":
                    usuarioMenu.opcoes();
                    break;

                case "M":
                    musicaMenu.opcoes();
                    break;

                case "X":
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("... opção inválida ...");
            }
        }
    }
}