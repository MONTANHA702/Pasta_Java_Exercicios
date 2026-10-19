package revisao.apidatetime.ex07stringparadatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime dataHora = LocalDateTime.parse("2026-10-19T19:54:30");
        System.out.println("DataHora: " + dataHora);

        LocalDateTime dataHora2 = LocalDateTime.parse("19/10/2026 19:54:30",
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("DataHora2: " + dataHora2);
    }
}
