package revisao.apidatetime.ex05outrasformasdeinstanciar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        //juntado LocalDate com LocalTime
        LocalDate data = LocalDate.of(1972,2,9);
        LocalTime hora = LocalTime.now();

        LocalDateTime dataHora = LocalDateTime.of(data, hora);
        System.out.println("Data antiga1: " + dataHora);

        //outras formas
        LocalDateTime dataHora2 = data.atTime(hora);
        System.out.println("Data antiga2: " + dataHora2);

        LocalDateTime dataHora3 = hora.atDate(data);
        System.out.println("Data antiga3: " + dataHora3);
    }
}
