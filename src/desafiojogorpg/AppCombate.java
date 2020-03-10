package desafiojogorpg;

import desafiojogorpg.personagens.Barbaros;
import desafiojogorpg.personagens.Clerigos;
import desafiojogorpg.personagens.Druidas;
import desafiojogorpg.personagens.Feiticeiros;
import desafiojogorpg.personagens.Guerreiros;
import desafiojogorpg.personagens.Magos;

public class AppCombate {

    public static void main(String[] args) {

        Barbaros clovis = new Barbaros("Clóvis", 100, 100, 100);
        Clerigos pierre = new Clerigos("Pierre", 100, 100, 100, 100);
        Druidas lana = new Druidas("Lana", 100, 100, 100, 100);
        Feiticeiros elak = new Feiticeiros ("Elak", 100, 100, 100, 100);
        Guerreiros uriah = new Guerreiros ("Uriah", 100, 100, 100);
        Magos gaspar = new Magos ("Gaspar", 100, 100, 100, 100);

        System.out.println("Nome do Bárbáro: " + clovis.nome); //teste
        System.out.println("nome do clerigo: " + pierre.nome); //teste


    }
}
