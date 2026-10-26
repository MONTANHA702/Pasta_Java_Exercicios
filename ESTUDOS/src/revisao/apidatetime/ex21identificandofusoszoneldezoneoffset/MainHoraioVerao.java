package revisao.apidatetime.ex21identificandofusoszoneldezoneoffset;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class MainHoraioVerao {
    public static void main(String[] args) {

        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");
        System.out.println(fusoSaoPaulo);

        //Horario verão
        ZoneOffset offsetSaoPaulo = fusoSaoPaulo.getRules()
                .getOffset(LocalDateTime.parse("2018-02-17T00:00:00"));
        System.out.println(offsetSaoPaulo);
    }
}
