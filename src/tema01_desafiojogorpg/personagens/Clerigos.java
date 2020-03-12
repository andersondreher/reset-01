package tema01_desafiojogorpg.personagens;

import tema01_desafiojogorpg.ataques.PoderDivino;

public class Clerigos {

    public String nome;
    public Integer vida;
    public Integer ataque;
    public Integer defesa;
    public Integer fe;

        public Clerigos (String nome, Integer vida, Integer ataque, Integer defesa, Integer fe){
            this.nome = nome;
            this.vida = vida;
            this.ataque = ataque;
            this.defesa = defesa;
            this.fe = fe;

        }

        Integer atacar(Barbaros personagemAtacado, PoderDivino poderDivinoUtilizado){
            Integer dano = (poderDivinoUtilizado.intensidadePoderDivino * ataque) - personagemAtacado.defesa;

            if (fe < poderDivinoUtilizado.custoFe){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            if (fe > poderDivinoUtilizado.custoFe){
                fe = fe - poderDivinoUtilizado.custoFe;
            }
            return dano;
        }

        Integer atacar(Clerigos personagemAtacado, PoderDivino poderDivinoUtilizado){
            Integer dano = (poderDivinoUtilizado.intensidadePoderDivino * ataque) - personagemAtacado.defesa;

            if (fe < poderDivinoUtilizado.custoFe){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            if (fe > poderDivinoUtilizado.custoFe){
                fe = fe - poderDivinoUtilizado.custoFe;
            }
            return dano;
        }

        Integer atacar(Druidas personagemAtacado, PoderDivino poderDivinoUtilizado){
            Integer dano = (poderDivinoUtilizado.intensidadePoderDivino * ataque) - personagemAtacado.defesa;

            if (fe < poderDivinoUtilizado.custoFe){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            if (fe > poderDivinoUtilizado.custoFe){
                fe = fe - poderDivinoUtilizado.custoFe;
            }
            return dano;
        }

        Integer atacar(Feiticeiros personagemAtacado, PoderDivino poderDivinoUtilizado){
            Integer dano = (poderDivinoUtilizado.intensidadePoderDivino * ataque) - personagemAtacado.defesa;

            if (fe < poderDivinoUtilizado.custoFe){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            if (fe > poderDivinoUtilizado.custoFe){
                fe = fe - poderDivinoUtilizado.custoFe;
            }
            return dano;
        }

        Integer atacar(Guerreiros personagemAtacado, PoderDivino poderDivinoUtilizado){
            Integer dano = (poderDivinoUtilizado.intensidadePoderDivino * ataque) - personagemAtacado.defesa;

            if (fe < poderDivinoUtilizado.custoFe){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            if (fe > poderDivinoUtilizado.custoFe){
                fe = fe - poderDivinoUtilizado.custoFe;
            }
            return dano;
        }

        Integer atacar(Magos personagemAtacado, PoderDivino poderDivinoUtilizado){
            Integer dano = (poderDivinoUtilizado.intensidadePoderDivino * ataque) - personagemAtacado.defesa;

            if (fe < poderDivinoUtilizado.custoFe){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            if (fe > poderDivinoUtilizado.custoFe){
                fe = fe - poderDivinoUtilizado.custoFe;
            }
            return dano;
        }
}
