package revisao.apidatetime.ex19alterandocomtemporaladjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

//TemporalAdjuster interface para implementar a lógica para encontrar uma data
//temporalAdjusters classe que fornece métodos prontos
public class Main {
    public static void main(String[] args) {

        LocalDate dataHoje = LocalDate.now();
        System.out.println("Data de hoje: " + dataHoje);
        System.out.println("========");

        LocalDate primeiraSegundaProximoMes = dataHoje
                .plusMonths(1)
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        System.out.println("Primeira segunda do próximo mês: " + primeiraSegundaProximoMes);

        System.out.println("========");

        LocalDate ultimoDiaMes = dataHoje.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Ultimo dia do mes: " + ultimoDiaMes);


        System.out.println("========");

        LocalDate dataProximaSexta = dataHoje.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        //LocalDate dataProximaSexta = dataHoje.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        //nextOrSame se hoje for sexta, já pega hoje
        System.out.println("Data de proxima sexta: " + dataProximaSexta);



    }
}
