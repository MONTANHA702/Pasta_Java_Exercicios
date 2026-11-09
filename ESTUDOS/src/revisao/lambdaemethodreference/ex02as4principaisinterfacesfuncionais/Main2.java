package revisao.lambdaemethodreference.ex02as4principaisinterfacesfuncionais;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("Trabalhando com tipos primitivos");

        IntPredicate predicate = num -> num > 10;
        boolean verificador = predicate.test(11);
        System.out.println(verificador);

        IntFunction<String> function = num -> "Número " + num;
        System.out.println(function.apply(1));

        IntSupplier supplier = () -> 10;
        System.out.println(supplier.getAsInt());

        IntConsumer consumer = num -> System.out.println("Número: " + num);
        consumer.accept(5);




    }
}
