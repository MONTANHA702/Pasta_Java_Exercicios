package revisao.apidatetime.ex17representandomes;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Month dezembro = Month.DECEMBER;
        Month mes = Month.of(2);
        LocalDate data = LocalDate.of(2021, Month.FEBRUARY, 12);
        Month mesDaData = data.getMonth();

        System.out.println(dezembro);
        System.out.println(mes);
        System.out.println(mesDaData.getDisplayName(TextStyle.SHORT, new Locale("pt", "BR")));

    }
}
