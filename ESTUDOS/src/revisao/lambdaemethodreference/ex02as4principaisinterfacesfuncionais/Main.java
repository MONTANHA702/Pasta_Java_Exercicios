package revisao.lambdaemethodreference.ex02as4principaisinterfacesfuncionais;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        System.out.println("Primeira interface funcional - Predicate -" +
                " retorna um booleano");
        Predicate<String> predicate = str -> str.startsWith("T");
        boolean comecaComT = predicate.test("Tango");
        System.out.println(comecaComT);


        System.out.println("Segunda interface funcional - Function");
        Function<String, LocalDate> function = str -> LocalDate.parse(str);
        LocalDate data = function.apply("2026-11-09");
        System.out.println(data);


        System.out.println("Terceira interface funcional - Supplier");
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        LocalDateTime datahora =  supplier.get();
        System.out.println(datahora);

        System.out.println("Quarta interface funcional - Consumer");
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Olá mergulhador");
    }
}
