public class Sacerdote extends Personagem {

    double fe;

    public Sacerdote(final String nome, final double vida, final double ataque, final double defesa, double fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }

    void atacar(Personagem alvo, PoderDivino poderDivino) { //um clerigo vai atacar tal personagem com tal poder divino
        if (this.vida > 0 && this.fe > poderDivino.custoDeFe) {
            double dano = calcularDano(alvo.defesa, poderDivino.poderDeAtaque);
            alvo.vida = alvo.vida - dano;
            this.fe = this.fe - poderDivino.custoDeFe;
            registrar(alvo.nome, poderDivino.nome, dano);
            if (alvo.vida <= 0) {
                System.out.println(alvo.nome + " morreu!");
                if(this.fe < 0){
                    System.out.println("O ataque não pode ocorrer por falta de fe"); // ESTA ERRADO
                }
                else {
                    System.out.println(this.nome + " não pode atacar " + alvo.nome + " pois está morto!");
                }
            }
        }
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Fé: " + this.fe);
    }
}

