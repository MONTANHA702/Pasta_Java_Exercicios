package revisao.collections.conjuntos.ex04linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Contato> contatos = new LinkedHashSet<>();
        //aceita null
        //mais lento que o hashSet
        //coloca os elementos em ordem

        contatos.add(new Contato("Maria", "maria@email.com", 40));
        contatos.add(new Contato("Jose", "jose2email.com", 30));
        contatos.add(new Contato("João", "joao@email.com", 25));
        contatos.add(new Contato("Rosa", "rosa@email.com", 50));
        contatos.add(null);


        for (Contato contato : contatos) {
            System.out.println(contato);
        }

    }
}
