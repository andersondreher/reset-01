public class Arcano extends Personagem {

    double mana;

    public Arcano(final String nome, final double vida, final double ataque, final double defesa, double mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    void atacar(Personagem alvo, Magia magia) {
        if (this.vida > 0 && this.mana > magia.custoDeMana) {
            double dano = calcularDano(alvo.defesa, magia.poderDeAtaque);
            alvo.vida = alvo.vida - dano;
            this.mana = this.mana - magia.custoDeMana;
            registrar(alvo.nome, magia.nome, dano);
            if (alvo.vida <= 0) {
                System.out.println(alvo.nome + " morreu!");
                if (this.mana < 0) {
                    System.out.println("O ataque não pode ocorrer por falta de fe"); // ESTA ERRADO
                }
                else {
                    System.out.println(this.nome + " não pode atacar " + alvo.nome + " pois está morto!");
                }
            }
        }
    }

        void imprimirEstado (){
            System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.mana);
        }
}

