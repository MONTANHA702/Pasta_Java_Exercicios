package revisao.apidatetime.ex13calculandoperiodos;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main2 {
    public static void main(String[] args) {

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Period tempoMedioEntrega = Period.parse("P3M");

        LocalDate dataHoje = LocalDate.now();

        LocalDate dataEntrega = dataHoje.plus(tempoMedioEntrega);

        System.out.println(formatador.format(dataHoje));
        System.out.println(formatador.format(dataEntrega));
    }
}
