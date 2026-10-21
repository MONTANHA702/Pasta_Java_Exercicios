package revisao.apidatetime.ex15calculandoduracoes;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDateTime dataHoraCompra = LocalDateTime.parse("2026-10-20T10:30:17");
        LocalDateTime dataHoraEntrega = LocalDateTime.parse("2026-10-21T11:13:00");
        //LocalDate nao pode ser usado com Duration porque não tem horas

        Duration tempoDecorrido = Duration.between(dataHoraCompra, dataHoraEntrega);

        System.out.printf("Tempo decorrido: %d dias %d horas %d min e %d seg%n",
                tempoDecorrido.toDaysPart(),
                tempoDecorrido.toHoursPart(),
                tempoDecorrido.toMinutesPart(),
                tempoDecorrido.toSecondsPart());

        //outras formas
        long tempoEntregaSegundos = dataHoraCompra.until(dataHoraEntrega, ChronoUnit.SECONDS);

        System.out.println("Tempo de entrega em segundos: " + tempoEntregaSegundos);
    }
}
