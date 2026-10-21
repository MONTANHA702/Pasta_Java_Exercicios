package revisao.apidatetime.ex16representandodiadasemana;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {

        DayOfWeek hoje = LocalDate.now().getDayOfWeek();
        DayOfWeek daquiAquinzeDias = hoje.plus(15);

        System.out.println(hoje);
        System.out.println(daquiAquinzeDias);
    }
}
