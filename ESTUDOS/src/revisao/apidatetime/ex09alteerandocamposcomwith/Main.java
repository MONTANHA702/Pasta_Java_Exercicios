package revisao.apidatetime.ex09alteerandocamposcomwith;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Main {
    public static void main(String[] args) {

        //O metodo with cria uma cópia da variável por isso
        //devemos sempre atribuir a uma outra variável (ou à mesma)
        LocalDateTime dataHoraAgora = LocalDateTime.now();


        //LocalDateTime novaDataHora = dataHoraAgora.with(ChronoField.DAY_OF_MONTH, 12);
        LocalDateTime novaDataHoraAgora = dataHoraAgora.withMonth(12)
                .withDayOfMonth(1)
                .withHour(0)
                .withMinute(0)
                .withSecond(0)
                .withNano(0);

        System.out.println(dataHoraAgora);
        System.out.println(novaDataHoraAgora);
    }
}
