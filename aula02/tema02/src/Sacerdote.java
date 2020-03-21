import java.util.List;

public abstract class Sacerdote extends Personagem {

    double fe;

    public Sacerdote(final String nome, final double vida, final double ataque, final double defesa, final double fe) {
        super(nome, vida, ataque, defesa);
        this.fe = fe;
    }

    private void atacarPrivado(Personagem atacado, PoderDivino poderDivinoUtilizado, List<String> registros, boolean ataqueEmArea) {
        if (this.getVida() > 0 && this.fe > poderDivinoUtilizado.getCustoDeFe()) {
            double dano = calcularDano(poderDivinoUtilizado.getIntensidade(), atacado.getDefesa());
            atacado.setVida(((atacado.getVida()) - dano));
            this.fe= fe - poderDivinoUtilizado.getCustoDeFe();
            String registro = "[" + dataHora() + "]" + " " + this.getNome() + " atacou " + atacado.getNome() + " com o " + poderDivinoUtilizado.getNome() + " causando dano de " + dano + ".";

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
            String registro = "[" + dataHora() + "]" + " " +this.getNome() + " não pode atacar pois está morto!";
            registros.add(registro);
        }
    }

    void atacar (Personagem atacado, PoderDivinoIndividual poderIndividual, List<String> registros){
        this.atacarPrivado(atacado, poderIndividual, registros, false);
    }

    void atacar (List<Personagem> personagensAtacados, PoderDivinoEmArea poderEmArea, List<String> registros){
        for (Personagem atacado : personagensAtacados){
            this.atacarPrivado(atacado, poderEmArea, registros, true);
        }
    }

    void imprimirStatus() {
        System.out.println(this.getNome() + " | Vida: " + this.getVida() + " | Fé: " + this.fe);
    }
}