import java.util.ArrayList;
import java.util.List;
import java.time.Duration;
import java.time.LocalDateTime;

public class AppCombate {

    public static void main(String[] args) {

        //LISTA DOS PERSONAGENS
        List<HomemDeArmas> homensDeArmas = new ArrayList<>();
        List<Arcano> arcanos = new ArrayList<>();
        List<Sacerdote> sacerdotes = new ArrayList<>();

        //DADOS DE ENTRADA: ARMAS, PODEDERES E MAGIAS COM SEUS RESPECTIVOS "STATUS"
        Arma zabaratana = new Arma("zabaratana", 5);
        Arma estilingue = new Arma("estilingue", 3);
        PoderDivinoIndividual onipotencia = new PoderDivinoIndividual("onipotência", 3, 2);
        PoderDivinoIndividual armaEspiritual = new PoderDivinoIndividual("arma espiritual", 4, 3);
        PoderDivinoEmArea cicloneDoAmor = new PoderDivinoEmArea("ciclone do amor", 2, 2);
        MagiaIndividual magiaBranca = new MagiaIndividual("magia branca", 4, 3);
        MagiaIndividual magiaNegra = new MagiaIndividual("magia negra", 3, 2);
        MagiaEmArea kabum = new MagiaEmArea("kabum", 3, 3);

        //INTRODUÇÃO PARA INÍCIO DA PARTIDA
        System.out.println(" ");
        System.out.println("                               SIMULAÇÃO DE RPG                                ");
        System.out.println(" ");
        System.out.println("--------------------Crie 6 personagens para iniciar o jogo!--------------------");
        System.out.println(" ");

        //CRIAÇÃO DOS PERSONAGENS
        CriarPersonagens criacao = new CriarPersonagens();

        //CONTADOR CRIAÇÃO DOS PERSONAGENS
        int contadorDePersonagens = 0;
        while (contadorDePersonagens < 6) {
            criacao.novoPersonagem(homensDeArmas, arcanos, sacerdotes);
            contadorDePersonagens++;
        }

        //PERSONAGENS CRIADOS
        HomemDeArmas personagem1 = homensDeArmas.get(0);
        HomemDeArmas personagem2 = homensDeArmas.get(1);
        Arcano personagem3 = arcanos.get(0);
        Arcano personagem4 = arcanos.get(1);
        Sacerdote personagem5 = sacerdotes.get(0);
        Sacerdote personagem6 = sacerdotes.get(1);

        List<Personagem> alvosGuerreiros = new ArrayList<>();
        alvosGuerreiros.add(personagem1);
        alvosGuerreiros.add(personagem2);
        List<Personagem>alvosArcanos = new ArrayList<>();
        alvosArcanos.add(personagem3);
        alvosArcanos.add(personagem4);
        List<Personagem> alvosSacerdotes = new ArrayList<>();
        alvosSacerdotes.add(personagem5);
        alvosSacerdotes.add(personagem6);

        //REGISTRO DE ATAQUE
        List<String> registros = new ArrayList<>();

        //DATA E HORA
        LocalDateTime horaInicial = LocalDateTime.now();

        //COMBATE
        personagem3.atacar(personagem5, magiaBranca, registros);
        personagem6.atacar(alvosSacerdotes, cicloneDoAmor, registros);
        personagem5.atacar(personagem1, armaEspiritual, registros);
        personagem2.equipar(zabaratana);
        personagem2.atacar(personagem1, registros, null);
        personagem4.atacar(alvosArcanos, kabum, registros);
        personagem2.equipar(estilingue);
        personagem2.atacar(personagem3, registros, null);
        personagem6.atacar(personagem2, armaEspiritual, registros);
        personagem1.equipar(zabaratana);
        personagem1.atacar(personagem2, registros, null);
        personagem5.atacar(personagem4, onipotencia, registros);
        personagem3.atacar(personagem5, magiaBranca, registros);
        personagem1.equipar(estilingue);
        personagem1.atacar(personagem3, registros, null);
        personagem4.atacar(personagem6, magiaNegra,registros);

        //REGISTRO DO COMBATE
        System.out.println("");
        System.out.println("-----------------------------Registro do combate:------------------------------");
        for (String item : registros) {
            System.out.println(item);
        }

        //STATUS FINAL DOS PERSONAGENS
        System.out.println("");
        System.out.println("----------------Status dos personagens após o final do combate:----------------");

        for (Personagem estado : arcanos) {
            estado.imprimirStatus();
        }

        for (Personagem estado : sacerdotes) {
            estado.imprimirStatus();

        }
        for (Personagem estado : homensDeArmas) {
            estado.imprimirStatus();

        }
        //DURAÇÃO DO COMBATE
        Duration tempoDeCombate = Duration.between(horaInicial, LocalDateTime.now());
        long tempo = tempoDeCombate.toMillis();
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("DURAÇÃO TOTAL DO COMBATE: " + tempo + " milissegundos.");
        System.out.println("-------------------------------------------------------------------------------");
    }
}