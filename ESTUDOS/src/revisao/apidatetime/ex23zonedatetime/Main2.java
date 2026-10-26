package revisao.apidatetime.ex23zonedatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main2 {
    public static void main(String[] args) {

        ZonedDateTime dataHoraPadrao = ZonedDateTime.now();
        ZonedDateTime dataHoraLosAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println(dataHoraPadrao);
        System.out.println(dataHoraLosAngeles);


    }
}
