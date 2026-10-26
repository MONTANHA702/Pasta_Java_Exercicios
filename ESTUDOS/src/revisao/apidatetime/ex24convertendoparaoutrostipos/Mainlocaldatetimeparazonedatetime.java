package revisao.apidatetime.ex24convertendoparaoutrostipos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Mainlocaldatetimeparazonedatetime {
    public static void main(String[] args) {

        LocalDateTime dataLocalDaFesta = LocalDateTime.parse("2023-09-19T20:00:00");
        System.out.println(dataLocalDaFesta);

        //convertendo para um zonedatetime
        ZonedDateTime dataDaFestaFuso = ZonedDateTime.of(dataLocalDaFesta, ZoneId.systemDefault());
        ZonedDateTime dataDaFestaFusoLosAngeles = ZonedDateTime
                .of(dataLocalDaFesta, ZoneId.of("America/Los_Angeles"));


        System.out.println(dataDaFestaFuso);
        System.out.println(dataDaFestaFusoLosAngeles);


    }
}
