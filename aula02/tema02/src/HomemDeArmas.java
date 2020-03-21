import java.util.List;

public abstract class HomemDeArmas extends Personagem {

    Arma arma;

    public HomemDeArmas(final String nome, final double vida, final double ataque, final double defesa) {
        super(nome, vida, ataque, defesa);
    }

    void atacar(Personagem atacado, List<String> registros, Poder poder) {
        if (this.getVida() > 0) {
            double dano = calcularDano(arma.getPoderDeAtaque(), atacado.getDefesa());
            atacado.setVida(((atacado.getVida()) - dano));
            String registro = "[" + dataHora() + "]" + " " + this.getNome() + " atacou " + atacado.getNome() + " com o " + arma.getNome() + " causando dano de " + dano + ".";
            registros.add(registro);

            if (atacado.getVida() <= 0) {
                registro = "[" + dataHora() + "]" + " " + atacado.getNome() + " morreu devido ao ataque!";
                registros.add(registro);
            }
        }

        if (this.getVida() <= 0) {
            String registro = "[" + dataHora() + "]" + " " + this.getNome() + " não pode atacar pois está morto!!";
            registros.add(registro);
        }
    }

    void equipar(Arma armaUtilizada) {
        this.arma = armaUtilizada;
    }


    void imprimirStatus() {
        System.out.println(this.getNome() + " | Vida: " + this.getVida());
    }
}
