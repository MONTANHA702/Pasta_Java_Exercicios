package revisao.collections.listas.ex05ordenandolistas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(2);
        numeros.add(31);
        numeros.add(4);
        numeros.add(55);

        //colocar na ordem natural
        //Collections.sort(numeros);

        //colocar na ordem inversa
        Collections.sort(numeros, Comparator.reverseOrder());

        //Para ordenar numa lista com tipos, p ex, Hotel
        //deve-se implementar a classe Comparable



        System.out.println(numeros);
    }
}
