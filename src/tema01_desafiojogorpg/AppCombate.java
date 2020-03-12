package tema01_desafiojogorpg;

import tema01_desafiojogorpg.personagens.*;
import tema01_desafiojogorpg.ataques.*;

public class AppCombate {

    public static void main(String[] args) {

        //DADOS DE ENTRADA: NOMES DOS PERSONAGENS COM SEUS RESPECTIVOS "STATUS"
        Barbaros clovis = new Barbaros("Clóvis", 100, 15, 33);
        Clerigos pierre = new Clerigos("Pierre", 100, 12, 25, 10);
        Druidas merlin = new Druidas("Merlin", 100, 10, 19, 11);
        Feiticeiros elak = new Feiticeiros("Elak", 100, 13, 17, 12);
        Guerreiros uriah = new Guerreiros("Uriah", 100, 14, 15);
        Magos gaspar = new Magos("Gaspar", 100, 13, 20, 13);

        //DADOS DE ENTRADA: ARMAS, PODEDERES E MAGIAS COM SEUS RESPECTIVOS "STATUS"
        Armas zabaratana = new Armas("zabaratana", 4);
        Armas estilingue = new Armas("estilingue", 5);
        Magias magiaBranca = new Magias("magia branca", 4, 2);
        Magias magiaNegra = new Magias("magia negra", 4, 2);
        PoderDivino onipotencia = new PoderDivino("onipotência", 4, 2);
        PoderDivino armaEspiritual = new PoderDivino("arma espiritual", 4, 2);

        //INÍCIO DO JOGO
        System.out.println("--------------------Que comecem os jogos!--------------------");
        System.out.println("");
        System.out.println("----------Status e apresentação dos participantes:-----------");
        System.out.println("");
        System.out.println("(✖╭╮✖)       O Barbaro "+ clovis.nome+"     Vida = " + clovis.vida);
        System.out.println("");
        System.out.println("(๑￫‿ฺ￩๑)      O Clérigo "+ pierre.nome+"     Vida = "+ pierre.vida + "      Fé = " + pierre.fe);
        System.out.println("");
        System.out.println("(ಠ_ಠ)        O Druida "+ merlin.nome+"      Vida = "+ merlin.vida + "      Fé = " + merlin.fe);
        System.out.println("");
        System.out.println("(๑￫‿ฺ￩๑)      O Feiticeiro "+ elak.nome+"    Vida = "+ elak.vida + "      Mana = " + elak.mana);
        System.out.println("");
        System.out.println("ᕙ༼*◕_◕*༽ᕤ   O Guerreiro "+ uriah.nome+"    Vida = "+ uriah.vida);
        System.out.println("");
        System.out.println("(｡♥‿♥｡)      O Mago "+ gaspar.nome+"        Vida = "+ gaspar.vida + "      Mana = " + gaspar.mana);
        System.out.println("");
        System.out.println("");

        //PRIMEIRA RODADA DE COBATES
        System.out.println("-----------------Primeira rodada do combate:-----------------");
        System.out.println("");

        //1° ATAQUE: O BÁRBARO CLOVIS ATACA O CLÉRIGO PIERRE
        if (clovis.vida > 0){
            Integer dano = clovis.atacar(pierre, zabaratana);
            System.out.println(clovis.nome + " atacou " + pierre.nome + " com " + zabaratana.nomeArma + " causando dano de " + dano);
            if (pierre.vida == 0){
                System.out.println("O Clérigo " + pierre.nome + " morreu!");
            }
        }
        else {
            System.out.println(clovis.nome + " não pode atacar " + pierre.nome + " pois está morto!");
        }

        System.out.println("");

        //2° ATAQUE: O CLÉRIGO PIERRE ATACA O DRUIDA MERLIN
        if (pierre.vida > 0){
            Integer dano = pierre.atacar(merlin, onipotencia);
            System.out.println(pierre.nome + " atacou " + merlin.nome + " com " + onipotencia.nomePoderDivino + " causando dano de " + dano);
            if (merlin.vida == 0){
                System.out.println("O Druida " + merlin.nome + " morreu!");
            }
        }
        else {
            System.out.println(pierre.nome + " não pode atacar " + merlin.nome + " pois está morto!");
        }

        System.out.println("");

        //3° ATAQUE: O DRUIDA MERLIN ATACA O FEITICEIRO ELAK
        if (merlin.vida > 0){
            Integer dano = merlin.atacar(elak, armaEspiritual);
            System.out.println(merlin.nome + " atacou " + elak.nome + " com " + armaEspiritual.nomePoderDivino + " causando dano de " + dano);
            if (elak.vida == 0){
                System.out.println("O Feiticeiro " + elak.nome + " morreu!");
            }
        }
        else {
            System.out.println(merlin.nome + " não pode atacar " + elak.nome + " pois está morto!");
        }

        System.out.println("");

        //4° ATAQUE: O FEITICEIRO ELAK ATACA O GUERREIRO URIAH
        if (elak.vida > 0){
            Integer dano = elak.atacar(uriah, magiaBranca);
            System.out.println(elak.nome + " atacou " + uriah.nome + " com " + magiaBranca.nomeMagia + " causando dano de " + dano);
            if (uriah.vida == 0){
                System.out.println("O Guerreiro " + uriah.nome + " morreu!");
            }
        }
        else {
            System.out.println(elak.nome + " não pode atacar " + uriah.nome + " pois está morto!");
        }

        System.out.println("");

        //5° ATAQUE: O GUERREIRO URIAH ATACA O MAGO GASPAR
        if (uriah.vida > 0){
            Integer dano = uriah.atacar(gaspar, estilingue);
            System.out.println(uriah.nome + " atacou " + gaspar.nome + " com " + estilingue.nomeArma + " causando dano de " + dano);
            if (gaspar.vida == 0){
                System.out.println("O Mago " + gaspar.nome + " morreu!");
            }
        }
        else {
            System.out.println(uriah.nome + " não pode atacar " + gaspar.nome + " pois está morto!");
        }

        System.out.println("");

        //6° ATAQUE: O MAGO GASPAR ATACA O BÁRBARO CLOVIS
        if (gaspar.vida > 0){
            Integer dano = gaspar.atacar(clovis, magiaNegra);
            System.out.println(gaspar.nome + " atacou " + clovis.nome + " com " + magiaNegra.nomeMagia + " causando dano de " + dano);
            if (clovis.vida == 0){
                System.out.println("O Bárbaro " + clovis.nome + " morreu!");
            }
        }
        else {
            System.out.println(gaspar.nome + " não pode atacar " + clovis.nome + " pois está morto!");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("------Status dos participantes após a primeira rodada:-------");
        System.out.println("");
        System.out.println("(✖╭╮✖)       O Barbaro "+ clovis.nome+"     Vida = " + clovis.vida);
        System.out.println("");
        System.out.println("(๑￫‿ฺ￩๑)      O Clérigo "+ pierre.nome+"     Vida = "+ pierre.vida + "      Fé = " + pierre.fe);
        System.out.println("");
        System.out.println("(ಠ_ಠ)        O Druida "+ merlin.nome+"      Vida = "+ merlin.vida + "      Fé = " + merlin.fe);
        System.out.println("");
        System.out.println("(๑￫‿ฺ￩๑)      O Feiticeiro "+ elak.nome+"    Vida = "+ elak.vida + "      Mana = " + elak.mana);
        System.out.println("");
        System.out.println("ᕙ༼*◕_◕*༽ᕤ   O Guerreiro "+ uriah.nome+"    Vida = "+ uriah.vida);
        System.out.println("");
        System.out.println("(｡♥‿♥｡)      O Mago "+ gaspar.nome+"        Vida = "+ gaspar.vida + "      Mana = " + gaspar.mana);
        System.out.println("");
        System.out.println("");

        //SEGUNDA RODADA DE COBATES
        System.out.println("------------Segunda e última rodada do combate:--------------");
        System.out.println("");

        //7° ATAQUE: DO BÁRBARO CLOVIS NO MAGO GASPAR
        if (clovis.vida > 0){
            Integer dano = clovis.atacar(gaspar, estilingue);
            System.out.println(clovis.nome + " atacou " + gaspar.nome + " com " + estilingue.nomeArma + " causando dano de " + dano);
            if (gaspar.vida == 0){
                System.out.println("O Mago " + gaspar.nome + " morreu!");
            }
        }
        else {
            System.out.println(clovis.nome + " não pode atacar " + gaspar.nome + " pois está morto!");
        }

        System.out.println("");

        //8° ATAQUE: O MAGO GASPAR ATACA O GUERREIRO URIAH
        if (gaspar.vida > 0){
            Integer dano = gaspar.atacar(uriah, magiaBranca);
            System.out.println(gaspar.nome + " atacou " + uriah.nome + " com " + magiaBranca.nomeMagia + " causando dano de " + dano);
            if (uriah.vida == 0){
                System.out.println("O Guerreiro " + uriah.nome + " morreu!");
            }
        }
        else {
            System.out.println(gaspar.nome + " não pode atacar " + uriah.nome + " pois está morto!");
        }

        System.out.println("");

        //9° ATAQUE: O GUERREIRO URIAH ATACA O FEITICEIRO ELAK
        if (uriah.vida > 0){
            Integer dano = uriah.atacar(elak, zabaratana);
            System.out.println(uriah.nome + " atacou " + elak.nome + " com " + zabaratana.nomeArma + " causando dano de " + dano);
            if (elak.vida == 0){
                System.out.println("O Feiticeiro " + elak.nome + " morreu!");
            }
        }
        else {
            System.out.println(uriah.nome + " não pode atacar " + elak.nome + " pois está morto!");
        }

        System.out.println("");

        //10° ATAQUE: O FEITICEIRO ELAK ATACA O DRUIDA MERLIN
        if (elak.vida > 0){
            Integer dano = elak.atacar(merlin, magiaNegra);
            System.out.println(elak.nome + " atacou " + merlin.nome + " com " + magiaNegra.nomeMagia + " causando dano de " + dano);
            if (merlin.vida == 0){
                System.out.println("O Druida " + merlin.nome + " morreu!");
            }
        }
        else {
            System.out.println(elak.nome + " não pode atacar " + merlin.nome + " pois está morto!");
        }

        System.out.println("");

        //11° ATAQUE: O DRUIDA MERLIN ATACA O CLÉRIGO PIERRE
        if (merlin.vida > 0){
            Integer dano = merlin.atacar(pierre, onipotencia);
            System.out.println(merlin.nome + " atacou " + pierre.nome + " com " + onipotencia.nomePoderDivino + " causando dano de " + dano);
            if (pierre.vida == 0){
                System.out.println("O Clérigo " + pierre.nome + " morreu!");
            }
        }
        else {
            System.out.println(merlin.nome + " não pode atacar " + pierre.nome + " pois está morto!");
        }

        System.out.println("");

        //12° ATAQUE: DO CLÉRIGO PIERRE ATACA O BÁRBARO CLOVIS
        if (pierre.vida > 0){
            Integer dano = pierre.atacar(clovis, armaEspiritual);
            System.out.println(pierre.nome + " atacou " + clovis.nome + " com " + armaEspiritual.nomePoderDivino + " causando dano de " + dano);
            if (clovis.vida == 0){
                System.out.println("O Bárbaro " + clovis.nome + " morreu!");
            }
        }
        else {
            System.out.println(pierre.nome + " não pode atacar " + clovis.nome + " pois está morto!");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("--------------Status final dos participantes:----------------");
        System.out.println("");
        System.out.println("(✖╭╮✖)       O Barbaro "+ clovis.nome+"     Vida = " + clovis.vida);
        System.out.println("");
        System.out.println("(๑￫‿ฺ￩๑)      O Clérigo "+ pierre.nome+"     Vida = "+ pierre.vida + "       Fé = " + pierre.fe);
        System.out.println("");
        System.out.println("(ಠ_ಠ)        O Druida "+ merlin.nome+"      Vida = "+ merlin.vida + "       Fé = " + merlin.fe);
        System.out.println("");
        System.out.println("(๑￫‿ฺ￩๑)      O Feiticeiro "+ elak.nome+"    Vida = "+ elak.vida + "       Mana = " + elak.mana);
        System.out.println("");
        System.out.println("ᕙ༼*◕_◕*༽ᕤ   O Guerreiro "+ uriah.nome+"    Vida = "+ uriah.vida);
        System.out.println("");
        System.out.println("(｡♥‿♥｡)      O Mago "+ gaspar.nome+"        Vida = "+ gaspar.vida + "        Mana = " + gaspar.mana);
        System.out.println("");
        System.out.println("");
        System.out.println("The End!");





    }
}
