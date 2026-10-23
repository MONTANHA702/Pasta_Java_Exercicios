package revisao.apidatetime.ex20compararandoobjetostemporais;

import java.time.LocalDate;
import java.time.chrono.ThaiBuddhistDate;

public class Main {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        LocalDate hoje2 = LocalDate.now();
        LocalDate depoisDeAmanha = hoje.plusDays(2);

        ThaiBuddhistDate hojeThai = ThaiBuddhistDate.now();

        System.out.println(hoje.equals(hoje2));
        System.out.println(hoje.equals(hojeThai));

        //para comparar datas em sistemas de calendários diferentes
        //usa-se .isEqual()
        System.out.println(hoje.isEqual(hojeThai));

        //comparando
        System.out.println(hoje.isAfter(depoisDeAmanha));
        System.out.println(hoje.isBefore(depoisDeAmanha));
        System.out.println(hoje.isEqual(depoisDeAmanha));


    }
}
