package revisao.apidatetime.ex07stringparadatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainLocalDate {
    public static void main(String[] args) {

        LocalDate data = LocalDate.parse("2026-10-19");//ISO
        System.out.println("Data: " + data);

        LocalDate data2 = LocalDate.parse("19/10/2026", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Data2: " + data2);
    }
}
