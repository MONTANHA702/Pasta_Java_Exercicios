package revisao.datetime.localdate;

import java.time.LocalDate;

//essa classe não tem informação de tempo nem de fuso-horário
//usa-se essa classe quando tem apenas que expressar a data simples
public class Main {
    public static void main(String[] args) {

        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje);

        LocalDate dataNascimento = LocalDate.of(1972, 2, 9);
        System.out.println(dataNascimento);

        LocalDate diaProgramador = LocalDate.ofYearDay(2026, 256);
        System.out.println("Dia do Programador: " + diaProgramador);

    }

}
