package revisao.collections.conjuntos.ex01hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set é uma interface que estende a interface Collection
//É bastante usada pela sua performace, e a implentação mais comum é o HashSet
//Não possui índice, então só itera via Iterator ou enhanced for
//Não aceita repetição de objetos

public class Main {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();
        numeros.add(100);
        numeros.add(2);
        numeros.add(31);
        numeros.add(40);
        numeros.add(5);
        numeros.add(5);

//        Iterator<Integer> numerosIterator = numeros.iterator();
//        while (numerosIterator.hasNext()) {
//            Integer numero = numerosIterator.next();
//            System.out.println(numero);
//        }

        for (Integer numero : numeros) {
            System.out.println(numero);
        }



    }
}
