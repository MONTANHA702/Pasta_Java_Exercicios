package revisao.apidatetime.ex15calculandoduracoes;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main2 {
    public static void main(String[] args) {

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Duration tempoMedioEntrega = Duration.parse("PT45M");
        LocalDateTime agora = LocalDateTime.now();

        LocalDateTime horarioPrevistoEntrega = agora.plus(tempoMedioEntrega);

        System.out.println("Horário do pedido: " + formatador.format(agora));
        System.out.println("Horário previsto de entrega: " + formatador.format(horarioPrevistoEntrega));
    }
}
