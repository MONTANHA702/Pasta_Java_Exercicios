package revisao.apidatetime.ex14usandoclasseduration;

import java.time.Duration;

//classe duration calcula o tempo baseado em horas
public class Main {
    public static void main(String[] args) {

        Duration duaracao = Duration.ofHours(5);
        Duration duaracaoDiasEmHoras = Duration.ofDays(3);
        Duration periodoTempoHoras = Duration.parse("P1DT5H");
//        Duration periodoTemHorasMais30Min = periodoTempoHoras.plus(
//                Duration.ofMinutes(30));
        Duration periodoTemHorasMais30Min = periodoTempoHoras.plusMinutes(30);
        Duration periodoTempoHorasX3 = periodoTempoHoras.multipliedBy(3);
        Duration periodoTempoHorasDividido = periodoTempoHoras.dividedBy(2);

        System.out.println(duaracao);
        System.out.println(duaracaoDiasEmHoras);
        System.out.println(periodoTempoHoras);
        System.out.println(periodoTemHorasMais30Min);
        System.out.println(periodoTempoHorasX3);
        System.out.println(periodoTempoHorasDividido);

        System.out.println("========");

        //obtendo por partes
        System.out.printf("Tempo calculado: %d dia(s) e %d hora(s)%n", periodoTempoHoras.toDaysPart(),
                periodoTempoHoras.toHoursPart());

    }
}
