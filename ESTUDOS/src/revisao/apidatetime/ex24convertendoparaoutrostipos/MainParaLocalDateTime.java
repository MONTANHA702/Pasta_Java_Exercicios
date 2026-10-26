package revisao.apidatetime.ex24convertendoparaoutrostipos;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class MainParaLocalDateTime {
    public static void main(String[] args) {

        ZonedDateTime dataHoraComFuso = ZonedDateTime.now();
        System.out.println(dataHoraComFuso);

        //extraindo dataHora
        LocalDateTime dataHoraSemFuso = dataHoraComFuso.toLocalDateTime();
        System.out.println(dataHoraSemFuso);
    }
}
