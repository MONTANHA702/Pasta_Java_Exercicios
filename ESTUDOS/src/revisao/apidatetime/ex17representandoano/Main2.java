package revisao.apidatetime.ex17representandoano;

import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Main2 {
    public static void main(String[] args) {

        Year ano = Year.parse("2024");
//        Year anoFuturo = ano.plusYears(10);
        Year anoFuturo = ano.plus(9, ChronoUnit.CENTURIES);


        System.out.println(anoFuturo);
    }
}
