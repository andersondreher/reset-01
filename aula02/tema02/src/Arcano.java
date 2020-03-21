import java.util.List;

public abstract class Arcano extends Personagem {

    double mana;

    public Arcano(final String nome, final double vida, final double ataque, final double defesa, final double mana) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
    }

    private void atacarPrivado (Personagem atacado, Magia magiaUtilizada, List<String> registros, boolean ataqueEmArea) {
        if (this.getVida() > 0 && this.mana > magiaUtilizada.getCustoDeMana()) {
            double dano = calcularDano(magiaUtilizada.getPoder(), atacado.getDefesa());
            atacado.setVida(((atacado.getVida()) - dano));
            this.mana = mana - magiaUtilizada.getCustoDeMana();
            String registro = "[" + dataHora() + "]" + " " + this.getNome() + " atacou " + atacado.getNome() + " com o " + magiaUtilizada.getNome() + " causando dano de " + dano + ".";

            if (ataqueEmArea) {
                registro = registro + "  (ataque em área)";
            }

            registros.add(registro);

            if (atacado.getVida() <= 0) {
                registro = "[" + dataHora() + "]" + " " + atacado.getNome() + " morreu devido ao ataque!";
                registros.add(registro);
            }
        }

        if (this.getVida() <= 0){
            String registro = "[" + dataHora() + "]" + " " + this.getNome() + " não pode atacar pois está morto!!";
            registros.add(registro);
        }
    }

    void atacar (Personagem atacado, MagiaIndividual magiaIndividual, List<String> registros){
        this.atacarPrivado(atacado, magiaIndividual, registros, false);
    }

    void atacar (List<Personagem> personagensAtacados, MagiaEmArea magiaEmArea, List<String> registros){
        for (Personagem atacado : personagensAtacados){
            this.atacarPrivado(atacado, magiaEmArea, registros, true);
        }
    }

    void imprimirStatus() {
        System.out.println(this.getNome() + " | Vida: " + this.getVida() + " | Mana: " + this.mana);
    }
}


