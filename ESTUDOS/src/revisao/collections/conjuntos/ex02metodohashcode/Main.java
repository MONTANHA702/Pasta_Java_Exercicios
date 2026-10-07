package revisao.collections.conjuntos.ex02metodohashcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //implementando um hashSet
        Set<Contato> contatos = new HashSet<>();

        contatos.add(new Contato("Maria", "maria@email.com", 40));
        contatos.add(new Contato("Jose", "jose2email.com", 30));
        contatos.add(new Contato("João", "joao@email.com", 25));
        contatos.add(new Contato("Rosa", "rosa@email.com", 50));
        //contatos.add(null);


        //.hashCode definido na classe Contado determina que se separem os ojbetos
        //pela primeira letra do email. Dessa forma contato2 e contato3 estão no
        //mesmo compartimento
        for (Contato contato : contatos) {
            //System.out.println(Objects.hashCode(contato));//se tiver um null
            System.out.println(contato.hashCode());
        }
    }
}
