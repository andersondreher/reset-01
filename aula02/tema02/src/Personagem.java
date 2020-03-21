import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public abstract class Personagem {

    private String nome;
    private double vida;
    private double ataque;
    private double defesa;

    public Personagem(final String nome, final double vida, final double ataque, final double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Double getDefesa() {
        return defesa;
    }

    double calcularDano(double poder, double defesa) {
        return poder * this.ataque - defesa;
    }

    void atacar(Personagem atacado, List<String> registros, Poder poder){
    }

    String dataHora (){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSSS"));
    }

    void imprimirStatus(){
    }
}


