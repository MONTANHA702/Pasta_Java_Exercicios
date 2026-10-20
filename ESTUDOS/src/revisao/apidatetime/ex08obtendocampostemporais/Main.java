package revisao.apidatetime.ex08obtendocampostemporais;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Main {
    public static void main(String[] args) {

        //DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //LocalDate data = LocalDate.parse("2026-10-20");
        //LocalDate data = LocalDate.parse("20/10/2026", formatador);
        //System.out.println("Data: " + data);
        //System.out.println("Data Formatada: " + formatador.format(data));

        LocalDate dataVencimento = LocalDate.parse("2026-10-20");

        //usando a API ChronoField
        System.out.println(ChronoField.DAY_OF_MONTH.getFrom(dataVencimento));
        System.out.println(ChronoField.DAY_OF_YEAR.getFrom(dataVencimento));

        //outra forma
        //System.out.println(dataVencimento.getLong(ChronoField.DAY_OF_MONTH));
        //System.out.println(dataVencimento.getLong(ChronoField.DAY_OF_YEAR));

        //metodos de fábrica
        System.out.println("-------");
        System.out.println(dataVencimento.getYear());
        System.out.println(dataVencimento.getMonth());
        System.out.println(dataVencimento.getMonthValue());
        System.out.println(dataVencimento.getDayOfMonth());
        System.out.println(dataVencimento.getDayOfYear());

    }
}
