package revisao.apidatetime.ex17diadomes;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class Main2 {
    public static void main(String[] args) {

        MonthDay diaDoMes = MonthDay.of(Month.FEBRUARY, 29);
        Year ano = Year.of(2023);

        System.out.println("O dia vale para o ano? " + ano.isValidMonthDay(diaDoMes));

    }
}
