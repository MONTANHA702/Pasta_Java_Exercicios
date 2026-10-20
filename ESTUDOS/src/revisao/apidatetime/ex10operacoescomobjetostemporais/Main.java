package revisao.apidatetime.ex10operacoescomobjetostemporais;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate hoje = LocalDate.parse("20/10/2026", formatador);
        System.out.println(formatador.format(hoje));

        LocalDate semanaPassada = hoje.minusWeeks(1);
        System.out.println(formatador.format(semanaPassada));


    }
}
