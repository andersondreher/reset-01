package tema01_desafiojogorpg.personagens;

import tema01_desafiojogorpg.ataques.Armas;

public class Barbaros {

    public String nome;
    public Integer vida;
    public Integer ataque;
    public Integer defesa;

        public Barbaros (String nome, Integer vida, Integer ataque, Integer defesa){
            this.nome = nome;
            this.vida = vida;
            this.ataque = ataque;
            this.defesa = defesa;

    }

        public Integer atacar(Barbaros personagemAtacado, Armas armaUtilizada){
            Integer dano = (armaUtilizada.poderAtaqueArma * ataque) - personagemAtacado.defesa;

            if (personagemAtacado.vida == 0){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            return dano;
        }

        public Integer atacar(Clerigos personagemAtacado, Armas armaUtilizada){
            Integer dano = (armaUtilizada.poderAtaqueArma * ataque) - personagemAtacado.defesa;

            if (personagemAtacado.vida == 0){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            return dano;
        }

        public Integer atacar(Druidas personagemAtacado, Armas armaUtilizada){
            Integer dano = (armaUtilizada.poderAtaqueArma * ataque) - personagemAtacado.defesa;

            if (personagemAtacado.vida == 0){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            return dano;
        }

        public Integer atacar(Feiticeiros personagemAtacado, Armas armaUtilizada){
            Integer dano = (armaUtilizada.poderAtaqueArma * ataque) - personagemAtacado.defesa;

            if (personagemAtacado.vida == 0){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            return dano;
        }

        public Integer atacar(Guerreiros personagemAtacado, Armas armaUtilizada){
            Integer dano = (armaUtilizada.poderAtaqueArma * ataque) - personagemAtacado.defesa;

            if (personagemAtacado.vida == 0){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            return dano;
        }

        public Integer atacar(Magos personagemAtacado, Armas armaUtilizada){
            Integer dano = (armaUtilizada.poderAtaqueArma * ataque) - personagemAtacado.defesa;

            if (personagemAtacado.vida == 0){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            return dano;
        }
}


