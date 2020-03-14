package tema01_desafiojogorpg.personagens;

import tema01_desafiojogorpg.ataques.Magias;

public class Feiticeiros {

    public String nome;
    public Integer vida;
    public Integer ataque;
    public Integer defesa;
    public Integer mana;

        public Feiticeiros (String nome, Integer vida, Integer ataque, Integer defesa, Integer mana){
            this.nome = nome;
            this.vida = vida;
            this.ataque = ataque;
            this.defesa = defesa;
            this.mana = mana;

        }

        public Integer atacar(Barbaros personagemAtacado, Magias magiaUtilizada){
            Integer dano = (magiaUtilizada.poderMagia * ataque) - personagemAtacado.defesa;

            if (mana < magiaUtilizada.custoMana){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            if (mana > magiaUtilizada.custoMana){
                mana = mana - magiaUtilizada.custoMana;
            }
            return dano;
        }

        public Integer atacar(Clerigos personagemAtacado, Magias magiaUtilizada){
            Integer dano = (magiaUtilizada.poderMagia * ataque) - personagemAtacado.defesa;

            if (mana < magiaUtilizada.custoMana){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            if (mana > magiaUtilizada.custoMana){
                mana = mana - magiaUtilizada.custoMana;
            }
            return dano;
        }

        public Integer atacar(Druidas personagemAtacado, Magias magiaUtilizada){
            Integer dano = (magiaUtilizada.poderMagia * ataque) - personagemAtacado.defesa;

            if (mana < magiaUtilizada.custoMana){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            if (mana > magiaUtilizada.custoMana){
                mana = mana - magiaUtilizada.custoMana;
            }
            return dano;
        }

        public Integer atacar(Feiticeiros personagemAtacado, Magias magiaUtilizada){
            Integer dano = (magiaUtilizada.poderMagia * ataque) - personagemAtacado.defesa;

            if (mana < magiaUtilizada.custoMana){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            if (mana > magiaUtilizada.custoMana){
                mana = mana - magiaUtilizada.custoMana;
            }
            return dano;
        }

        public Integer atacar(Guerreiros personagemAtacado, Magias magiaUtilizada){
            Integer dano = (magiaUtilizada.poderMagia * ataque) - personagemAtacado.defesa;

            if (mana < magiaUtilizada.custoMana){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            if (mana > magiaUtilizada.custoMana){
                mana = mana - magiaUtilizada.custoMana;
            }
            return dano;
        }

        public Integer atacar(Magos personagemAtacado, Magias magiaUtilizada){
            Integer dano = (magiaUtilizada.poderMagia * ataque) - personagemAtacado.defesa;

            if (mana < magiaUtilizada.custoMana){
                dano = 0;
            }
            if (personagemAtacado.vida < dano){
                personagemAtacado.vida = 0;
            }
            else {
                personagemAtacado.vida = personagemAtacado.vida - dano;
            }
            if (mana > magiaUtilizada.custoMana){
                mana = mana - magiaUtilizada.custoMana;
            }
            return dano;
        }
}


