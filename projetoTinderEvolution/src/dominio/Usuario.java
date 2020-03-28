package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Usuario {

    private List<Musica> musicasCurtidas;
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate nascimento;
    private String bio;
    private Double latitude;
    private Double longitude;

    public Usuario(String nome, String email, String telefone, LocalDate nascimento, String bio, Double latitude, Double longitude) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.bio = bio;
        this.latitude = latitude;
        this.longitude = longitude;
        this.musicasCurtidas = new ArrayList<>();
    }

    public void acrescentarMusica(Musica musica){
        this.musicasCurtidas.add(musica);
    }

    public List<Musica> getMusicasCurtidas(){
        return musicasCurtidas;
    }

    public int getId(){
        return id;
    }

    public void setId(final int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public LocalDate getNascimento(){
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento){
        this.nascimento = nascimento;
    }

    public String getBio(){
        return bio;
    }

    public void setBio(String bio){
        this.bio = bio;
    }

    public Double getLatitude(){
        return latitude;
    }

    public void setLatitude(Double latitude){
        this.latitude = latitude;
    }

    public Double getLongitude(){
        return longitude;
    }

    public void setLongitude(Double longitude){
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", nascimento=" + nascimento +
                ", bio='" + bio + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}

