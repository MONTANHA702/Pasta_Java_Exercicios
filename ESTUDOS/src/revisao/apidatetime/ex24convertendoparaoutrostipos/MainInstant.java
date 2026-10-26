package revisao.apidatetime.ex24convertendoparaoutrostipos;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MainInstant {
    public static void main(String[] args) {

        //convertendo para Instant
        ZonedDateTime dataHoraFusoSaoPaulo = ZonedDateTime
                .parse("2026-10-25T12:00:00-03:00[America/Sao_Paulo]");

        Instant instante = dataHoraFusoSaoPaulo.toInstant();

        System.out.println(dataHoraFusoSaoPaulo);
        System.out.println(instante);

        //converteno o instant para localdatetime de Los Angeles
        LocalDateTime dataHoraLosAngeles = LocalDateTime.ofInstant(instante, ZoneId.of("America/Los_Angeles"));
        System.out.println("Data hora em Los Angeles: "+ dataHoraLosAngeles);
    }
}
