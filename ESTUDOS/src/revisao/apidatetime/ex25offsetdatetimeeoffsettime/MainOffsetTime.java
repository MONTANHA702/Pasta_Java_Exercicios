package revisao.apidatetime.ex25offsetdatetimeeoffsettime;

import java.time.OffsetTime;
import java.time.ZoneId;

public class MainOffsetTime {
    public static void main(String[] args) {

        OffsetTime hora = OffsetTime.now();
        System.out.println(hora);

        OffsetTime horaAustralia = OffsetTime.now(ZoneId.of("Australia/Queensland"));
        System.out.println(horaAustralia);
    }
}
