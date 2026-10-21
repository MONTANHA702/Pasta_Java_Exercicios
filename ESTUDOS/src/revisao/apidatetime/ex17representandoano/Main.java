package revisao.apidatetime.ex17representandoano;

import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {

//        Year ano = Year.now();
//        Year ano = Year.of(2025);
//        Year ano = Year.from(LocalDate.now());
        Year ano = Year.parse("2024");

        if (ano.isLeap()) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        System.out.println("======");

        LocalDate diaDoProgramador = ano.atDay(256);
        System.out.println("Dia do programador: " + diaDoProgramador);

    }
}
