package dominio;

import com.sun.istack.internal.NotNull;

import java.time.LocalDate;

public class Musica {

    private int id;
    private String nome;
    private String artista;
    private EstiloMusical estiloMusical;  //aqui faço uma classe enum
    private LocalDate lancamento;

    public Musica( String nome, String artista, EstiloMusical estiloMusical, LocalDate lancamento) {
        this.nome = nome;
        this.artista = artista;
        this.estiloMusical = estiloMusical;
        this.lancamento = lancamento;                //id não vai no construtor pq é automatico, gero o id na hora de salvar a musica
    }

    public int getId(){
        return id;
    }

    public void setId(final int id){           //estudar "final", pq usado as vezes sim e as vezes não?
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista(){
        return artista;
    }

    public void setArtista(String artista){
        this.artista = artista;
    }

    public EstiloMusical getEstiloMusical(){
        return estiloMusical;
    }

    public void setEstiloMusical(final EstiloMusical estiloMusical){
        this.estiloMusical = estiloMusical;
    }

    public LocalDate getLancamento(){
        return lancamento;
    }

    public void setLancamento (LocalDate lancamento){
        this.lancamento = lancamento;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", estiloMusical=" + estiloMusical +
                ", lancamento=" + lancamento +
                '}';
    }
}
