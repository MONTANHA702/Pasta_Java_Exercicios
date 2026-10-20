package revisao.apidatetime.ex10operacoescomobjetostemporais;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main2 {
    public static void main(String[] args) {

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime semanaPassada = agora.minusWeeks(2)
                .minusHours(10);

        LocalDateTime dataVencimento = agora.plusDays(30);


        System.out.println(formatador.format(agora));
        System.out.println(formatador.format(semanaPassada));
        System.out.println("Data vencimento: " + formatador.format(dataVencimento));

    }
}
