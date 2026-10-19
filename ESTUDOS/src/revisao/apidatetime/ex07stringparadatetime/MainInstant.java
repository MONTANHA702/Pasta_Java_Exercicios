package revisao.apidatetime.ex07stringparadatetime;

import java.time.Instant;

public class MainInstant {
    public static void main(String[] args) {

        //data, hora, utc
        //Instant instante = Instant.parse("2026-10-19T19:45:00-00:00");
        Instant instante = Instant.parse("2026-10-19T19:45:00Z");

        System.out.println(instante);
    }
}
