package revisao.apidatetime.ex18mesdoano;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {

        YearMonth mesAno = YearMonth.now();
        YearMonth mesAno1 = YearMonth.of(2026, Month.MARCH);
        YearMonth mesAno2 = YearMonth.from(LocalDate.now());
        YearMonth mesAno3 = YearMonth.parse("2026-02");

        LocalDate dataAniversario = mesAno3.atDay(9);

        LocalDate ultimoDiaMes = mesAno3.atEndOfMonth();

        System.out.println(mesAno);
        System.out.println(mesAno1);
        System.out.println(mesAno2);
        System.out.println(mesAno3);
        System.out.println("Data Aniversario: " + dataAniversario);
        System.out.println("Ultimo dia mês: "  + ultimoDiaMes.getDayOfMonth());
    }
}
