package revisao.apidatetime.ex04localdatetime;

//tem informação de data e hora, mas não tem informação de fuso horário
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println("Data atual: " + dataHora);

        LocalDateTime evento = LocalDateTime.of(2026, 10, 19, 11, 10);
        System.out.println("Evento agendado: " + evento);
    }
}
