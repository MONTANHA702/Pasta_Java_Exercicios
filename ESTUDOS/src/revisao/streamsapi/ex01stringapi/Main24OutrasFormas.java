package revisao.streamsapi.ex01stringapi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main24OutrasFormas {
    public static void main(String[] args) {

        String[] nomes = {"Maria", "Sebastião", "Pedro"};
        Arrays.stream(nomes)
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        System.out.println("------");

        //formar uma lista
        //elemento inicial, final e iteracao
        Stream.iterate(new BigDecimal("1000"),
                valor -> valor.compareTo(BigDecimal.ZERO) >= 0,
                valor -> valor.subtract(new BigDecimal("100")))
                .forEach(System.out::println);

        System.out.println("-------");

        //stream vazio
        Stream<Integer> stream = Stream.empty();

        //criando stream com varargs
        int total = IntStream.of(1, 2, 3, 4, 5)
                .sum();
        System.out.println(total);

        System.out.println("-----");

        //concatenando streams
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
        Stream.concat(stream1, stream2).forEach(System.out::println);

        System.out.println("-----");

        //stream com range
        IntStream.range(1, 11)
                .forEach(System.out::println);
        System.out.println("------");
        IntStream.rangeClosed(10,20)
                .forEach(System.out::println);
        System.out.println("------");


        //saltando elementos
        IntStream.rangeClosed(10,20)
                .skip(2)//salta o 10 e 11
                .forEach(System.out::println);
        System.out.println("------");

        //radomizando com stream
        Random random = new Random();
        Stream.generate(() -> random.nextInt(10) +1)
                .distinct()
                .limit(6) //se nao colocar limite fica infinito
                .forEach(System.out::println);














    }
}
