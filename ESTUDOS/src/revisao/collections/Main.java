package revisao.collections;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        System.out.println("Data de hoje aqui: " + data);
        LocalTime time = LocalTime.now();
        System.out.println("Hora de hoje aqui: " + time);

        LocalDate data2 = LocalDate.now(ZoneId.of("Japan"));
        System.out.println("Data de hoje no Pacífico: " + data2);
        LocalTime time2 = LocalTime.now(ZoneId.of("Japan"));
        System.out.println("Hora de hoje no Pacífico: " + time2);
    }
}
