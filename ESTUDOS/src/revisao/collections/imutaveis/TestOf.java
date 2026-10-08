package revisao.collections.imutaveis;

import java.util.ArrayList;
import java.util.List;

public class TestOf {
    public static void main(String[] args) {

        List<Integer> lista = List.of(1, 2);
        System.out.println(lista);
        //lista é imutável
        //lista.add(3); gera exceção

        List<Integer> lista2 = List.of();//lista vazia imutável


    }
}
