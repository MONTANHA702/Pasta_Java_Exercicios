package revisao.apidatetime.ex21identificandofusoszoneldezoneoffset;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class MainInstant {
    public static void main(String[] args) {

        Instant instante = Instant.now();
        System.out.println(instante);


        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");
        LocalDateTime dataHora = LocalDateTime.ofInstant(instante, fusoSaoPaulo);
        System.out.println(dataHora);
    }
}
