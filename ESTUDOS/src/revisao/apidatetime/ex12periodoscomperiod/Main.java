package revisao.apidatetime.ex12periodoscomperiod;

import java.time.Period;


//Period é somente para quantidade de tempo a partir de dias. Não tem horas
public class Main {
    public static void main(String[] args) {

        Period periodo = Period.ofDays(20);
        Period periodo2 = Period.ofMonths(1);
        Period periodo3 = Period.of(3, 10, 15);
        Period periodo4 = periodo3.plus(Period.ofYears(10));
        Period periodo5 = periodo3.multipliedBy(3).normalized();

        System.out.printf("Período 5: %d anos, %d meses e %d dias%n", periodo5.getYears(),
                periodo5.getMonths(), periodo5.getDays());



        System.out.println(periodo);
        System.out.println(periodo2);
        System.out.println(periodo3);
        System.out.println(periodo4);
        System.out.println(periodo5);

    }
}
