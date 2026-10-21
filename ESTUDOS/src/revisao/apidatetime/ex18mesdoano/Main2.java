package revisao.apidatetime.ex18mesdoano;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class Main2 {
    public static void main(String[] args) {

        YearMonth anoMes = YearMonth.parse("2022-12");
        YearMonth anoMesFusturo = anoMes.plusYears(3);
        YearMonth anoMesFuturo1 = anoMes.plus(3, ChronoUnit.CENTURIES);

        System.out.println(anoMesFusturo);
        System.out.println(anoMesFuturo1);

        System.out.println("========");

        //long tempoEmMeses = anoMes.until(YearMonth.now(), ChronoUnit.MONTHS);
        long tempoEmMeses = anoMes.until(LocalDate.now(), ChronoUnit.MONTHS);

        System.out.println("Tempo em meses: " + tempoEmMeses);




    }
}
