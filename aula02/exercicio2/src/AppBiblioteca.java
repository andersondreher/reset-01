public class AppBiblioteca {

    public static void main(String[] args) {
        Livro livro1 = new Livro ("Chaves", "Roberto Bolaños", Categoria.SUSPENSE, Status.DISPONIVEL);
        livro1.imprimir();

        Livro livro2 = new Livro("O iluminado", "Stephen King", Categoria.TERROR, Status.EM_USO);
        livro2.imprimir();
    }
}
