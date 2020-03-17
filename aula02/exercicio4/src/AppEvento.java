import java.awt.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AppEvento {

    public static void main(String[] args) {

        Evento evento = new Evento("CWI Reset", "CWI Software - São Leopoldo", LocalDateTime.of(2020, 03, 21, 8, 30));

        Duration tempoRestante = Duration.between(LocalDateTime.now(), evento.getDataHora());
        long dias = tempoRestante.toDays();

        String dataFormatada = evento.getDataHora().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.println(dataFormatada + " - " + evento.getDescricao() + " (" + evento.getLocal() + ") - Faltam " + dias + " dias");

    }

}