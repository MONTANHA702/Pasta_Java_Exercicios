package revisao.apidatetime.ex25offsetdatetimeeoffsettime;

import java.time.OffsetDateTime;
import java.time.ZoneId;

public class MainOffsetDateTime {
    public static void main(String[] args) {

        OffsetDateTime datHora = OffsetDateTime.now();
        OffsetDateTime datHoraJapao = OffsetDateTime.now(ZoneId.of("Japan"));


        System.out.println(datHora);
        System.out.println(datHora.getOffset());

        System.out.println(datHoraJapao);
        System.out.println(datHoraJapao.getOffset());
    }
}
