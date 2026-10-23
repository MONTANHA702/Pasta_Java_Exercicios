package revisao.apidatetime.ex19alterandocomtemporaladjusters;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MainNatalTemporalAdjuster {
    public static void main(String[] args) {

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataHoje = LocalDate.now();
        LocalDate dataNatal = dataHoje.with(new NatalTemporalAdjuster());

        System.out.println("Data de hoje: " + formatador.format(dataHoje));
        System.out.println("Data de natal: " + formatador.format(dataNatal));

        System.out.println("========");

       long diasAteNatal = dataHoje.until(dataNatal, ChronoUnit.DAYS);
        System.out.println("Dias até o Natal: " + diasAteNatal);
    }
}
