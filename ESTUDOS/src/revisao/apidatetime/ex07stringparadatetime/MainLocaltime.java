package revisao.apidatetime.ex07stringparadatetime;

import java.time.LocalDate;
import java.time.LocalTime;

public class MainLocaltime {
    public static void main(String[] args) {

        LocalTime hora = LocalTime.parse("19:54:30");
        System.out.println("Hora: " + hora);

    }
}
