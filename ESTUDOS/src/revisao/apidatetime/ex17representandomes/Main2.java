package revisao.apidatetime.ex17representandomes;

import java.time.LocalDate;
import java.time.Month;

public class Main2 {
    public static void main(String[] args) {

        Month mesAtual = LocalDate.now().getMonth();

        Month mesCalculado = mesAtual.plus(10);

        System.out.println(mesAtual);
        System.out.println(mesCalculado);
    }
}
