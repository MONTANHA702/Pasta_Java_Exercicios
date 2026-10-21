package revisao.apidatetime.ex16representandodiadasemana;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


//usa-se somente para representar dias da semana, nunca datas.
public class Main {
    public static void main(String[] args) {

//        DayOfWeek dia = DayOfWeek.MONDAY;
//        DayOfWeek dia = LocalDate.now().getDayOfWeek();
        DayOfWeek dia = DayOfWeek.of(1);

        System.out.println("Dia: " + dia);

        System.out.println(dia.getDisplayName(TextStyle.FULL, Locale.US));
        System.out.println(dia.getDisplayName(TextStyle.SHORT, Locale.US));
        System.out.println(dia.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));


    }
}
