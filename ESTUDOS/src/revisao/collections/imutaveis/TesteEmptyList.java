package revisao.collections.imutaveis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteEmptyList {
    public static void main(String[] args) {

        List<Integer> lista = Collections.emptyList();
        System.out.println(lista);//lista vazia e imutável
    }
}
