package revisao.apidatetime.ex22Instanciandoemfusoespecifico;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime agora2 = LocalDateTime.now(ZoneId.of("Japan"));
        LocalDateTime agora3 = LocalDateTime.now(ZoneId.of("Singapore"));
        LocalDateTime agora4 = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));


        System.out.println("Agora: " + formatter.format(agora));
        System.out.println("Agora no Japão: " + formatter.format(agora2));
        System.out.println("Agora em Singapura: " + formatter.format(agora3));
        System.out.println("Agora em LosAngeles: " + formatter.format(agora4));

    }

}
