package aula02;

public class Veiculo {

    String nome;
    double velocidadeMaxima;
    Terreno terreno;

        public Veiculo(String nome, Double velocidadeMaxima, Terreno terreno){
            this.nome = nome;
            this.velocidadeMaxima = velocidadeMaxima;
            this.terreno = terreno;
        }

     public String toString() {
            return "Não Configurado";
     }
}
