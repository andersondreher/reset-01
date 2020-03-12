package tema01_desafiojogorpg;

import tema01_desafiojogorpg.personagens.*;
import tema01_desafiojogorpg.ataques.*;

public class AppCombate {

    public static void main(String[] args) {

        //PERSONAGENS ESCOLHIDOS COM SEUS RESPECTIVOS "STATUS"
        Barbaros clovis = new Barbaros("Clóvis", 100, 10, 10);
        Clerigos pierre = new Clerigos("Pierre", 100, 10, 10, 10);
        Druidas lana = new Druidas("Lana", 100, 10, 10, 10);
        Feiticeiros elak = new Feiticeiros("Elak", 100, 10, 10, 10);
        Guerreiros uriah = new Guerreiros("Uriah", 100, 10, 10);
        Magos gaspar = new Magos("Gaspar", 100, 10, 10, 10);

        //ARMAS, PODEDERES E MAGIAS ESCOLHIDAS COM SEUS RESPECTIVOS "STATUS"
        Armas zabaratana = new Armas("zabaratana", 4);
        Armas estilingue = new Armas("estilingue", 5);
        Magias magiaBranca = new Magias("magia Branca", 4, 3);
        Magias magiaNegra = new Magias("magia negra", 3, 4);
        PoderDivino onipotencia = new PoderDivino("onipotência", 4, 2);
        PoderDivino armaEspiritual = new PoderDivino("arma espiritual", 3, 3);

    }
}
