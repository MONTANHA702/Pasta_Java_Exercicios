package revisao.apidatetime.ex17representandomes;

import java.time.Month;

public class Main3 {
    public static void main(String[] args) {

        //calcular o primeiro dia do mes em relacao ao ano
        System.out.println(Month.DECEMBER.firstDayOfYear(true));
        System.out.println(Month.DECEMBER.firstDayOfYear(false));

        System.out.println(Month.FEBRUARY.length(true));
        System.out.println(Month.FEBRUARY.length(false));

        //achar o primeiro mes do trimestre
        System.out.println(Month.MARCH.firstMonthOfQuarter());
        System.out.println(Month.OCTOBER.firstMonthOfQuarter());

    }
}
