package revisao.collections.imutaveis;

import java.util.Collections;
import java.util.List;

public class TesteSingletonList {
    public static void main(String[] args) {
        List<Integer> lista = Collections.singletonList(1);
        System.out.println(lista);//lista com um elemento e imutável
    }
}
