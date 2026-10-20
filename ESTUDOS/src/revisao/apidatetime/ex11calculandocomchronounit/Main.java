package revisao.apidatetime.ex11calculandocomchronounit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        //LocalDate proximaParcela = hoje.plusDays(30);
        LocalDate proximaParcela = hoje.plus(30, ChronoUnit.DAYS);
        //LocalDate proximaParcela = ChronoUnit.DAYS.addTo(hoje, 30);

        LocalDate decadaPassada = hoje.minus(1, ChronoUnit.DECADES);

        System.out.println(hoje);
        System.out.println(proximaParcela);
        System.out.println(decadaPassada);
    }
}
