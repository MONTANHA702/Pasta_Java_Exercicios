package revisao.apidatetime.ex17diadomes;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.util.Map;

//apenas mes e dia
public class Main {
    public static void main(String[] args) {

        MonthDay diaMesAtual = MonthDay.now();
        MonthDay diaAniversario = MonthDay.of(Month.FEBRUARY, 9);
        MonthDay diaMes = MonthDay.from(LocalDate.now());
        MonthDay diaTexto = MonthDay.parse("--10-21");

        //LocalDate dataAniversario = diaTexto.atYear(2026);
        LocalDate dataAniversario = Year.now().atMonthDay(diaTexto);



        System.out.println(diaMesAtual);
        System.out.println("Dia Aniversario: " + diaAniversario);
        System.out.println("Dia Mes: " + diaMes);
        System.out.println("Dia Texto: " + diaTexto);
        System.out.println("Data Aniversario: " + dataAniversario);
    }
}
