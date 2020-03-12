package tema01_desafiojogorpg;

import tema01_desafiojogorpg.personagens.*;
import tema01_desafiojogorpg.ataques.*;

public class AppCombate {

    public static void main(String[] args) {

        //DADOS DE ENTRADA: NOMES DOS PERSONAGENS COM SEUS RESPECTIVOS "STATUS"
        Barbaros clovis = new Barbaros("Clóvis", 100, 10, 10);
        Clerigos pierre = new Clerigos("Pierre", 100, 10, 10, 8);
        Druidas merlin = new Druidas("Merlin", 100, 10, 10, 9);
        Feiticeiros elak = new Feiticeiros("Elak", 100, 10, 10, 10);
        Guerreiros uriah = new Guerreiros("Uriah", 100, 10, 10);
        Magos gaspar = new Magos("Gaspar", 100, 10, 10, 10);

        //DADOS DE ENTRADA: ARMAS, PODEDERES E MAGIAS COM SEUS RESPECTIVOS "STATUS"
        Armas zabaratana = new Armas("zabaratana", 4);
        Armas estilingue = new Armas("estilingue", 5);
        Magias magiaBranca = new Magias("magia Branca", 4, 3);
        Magias magiaNegra = new Magias("magia negra", 3, 4);
        PoderDivino onipotencia = new PoderDivino("onipotência", 4, 2);
        PoderDivino armaEspiritual = new PoderDivino("arma espiritual", 3, 3);

        //INÍCIO DO JOGO
        System.out.println("--------------------Que comecem os jogos!--------------------");
        System.out.println("");
        System.out.println("---------------Apresentação dos participantes:---------------");
        System.out.println("");
        System.out.println("(✖╭╮✖)       O Barbaro "+ clovis.nome+"     Vida = " + clovis.vida);
        System.out.println("");
        System.out.println("(๑￫‿ฺ￩๑)      O Clérigo "+ pierre.nome+"     Vida = "+ pierre.vida + "     Fé = " + pierre.fe);
        System.out.println("");
        System.out.println("(ಠ_ಠ)        O Druida "+ merlin.nome+"      Vida = "+ merlin.vida + "     Fé = " + merlin.fe);
        System.out.println("");
        System.out.println("(๑￫‿ฺ￩๑)      O Feiticeiro "+ elak.nome+"    Vida = "+ elak.vida + "     Mana = " + elak.mana);
        System.out.println("");
        System.out.println("ᕙ༼*◕_◕*༽ᕤ   O Guerreiro "+ uriah.nome+"    Vida = "+ uriah.vida);
        System.out.println("");
        System.out.println("(｡♥‿♥｡)      O Mago "+ gaspar.nome+"        Vida = "+ gaspar.vida + "     Mana = " + gaspar.mana);
        System.out.println("-------------------------------------------------------------");
        System.out.println("");

        //PRIMEIRA RODADA DE COBATES
        System.out.println("-----------------Primeira rodada de combates:----------------");
        System.out.println("");

            //ATAQUE DO BÁRBARO CLOVIS NO CLÉRIGO PIERRE
                if (clovis.vida > 0){
                Integer dano = clovis.atacar(pierre, zabaratana);
                    System.out.println(clovis.nome + " atacou " + pierre.nome + " com o " + zabaratana.nomeArma + " causando dano de " + dano);
                if (pierre.vida == 0){
                    System.out.println("O Clérigo " + pierre.nome + " morreu!");
                    }
                }
                else {
                    System.out.println(clovis.nome + " não pode atacar " + pierre.nome + " pois está morto!");
                }
    }
}
