public class Livro {

    private String titulo;
    private String autor;
    private Categoria categoria;
    private Status status;

    public Livro(String titulo, String autor, Categoria categoria, Status status) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.status = status;
    }

    @Override
    public String toString() {
        return categoria + "-" +"Livro:" +
                "Titulo='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", Categoria=" + categoria +
                ", Status=" + status +
                '.';
    }
}

