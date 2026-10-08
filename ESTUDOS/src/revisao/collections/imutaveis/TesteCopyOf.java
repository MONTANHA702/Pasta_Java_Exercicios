package revisao.collections.imutaveis;

import java.util.ArrayList;
import java.util.List;

public class TesteCopyOf {
    public static void main(String[] args) {

        List<Integer> numeros1 = new ArrayList<>();
        numeros1.add(1);
        numeros1.add(2);

        System.out.println(numeros1);

        List<Integer> numeros2 = List.copyOf(numeros1);
        System.out.println(numeros2);
        //numeros2 é uma cópia imutável
        //numeros2.add(3); vai gerar exceção
        numeros1.add(3);
        System.out.println(numeros1);
    }
}
