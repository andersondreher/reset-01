public class HomemDeArmas extends Personagem {

    public HomemDeArmas(final String nome, final double vida, final double ataque, final double defesa) {
        super(nome, vida, ataque, defesa);
    }

    void atacar(Personagem alvo, Arma arma) {
        if (this.vida > 0) {
            double dano = calcularDano(alvo.defesa, arma.poderDeAtaque);
            alvo.vida = alvo.vida - dano;
            registrar(alvo.nome, arma.nome, dano);
            if (alvo.vida <= 0) {
                System.out.println(alvo.nome + " morreu!");
            }
        }
        else {
            System.out.println(this.nome + " não pode atacar " + alvo.nome + " pois está morto!");
        }
    }

    void imprimirEstado(){
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida);
    }
}
