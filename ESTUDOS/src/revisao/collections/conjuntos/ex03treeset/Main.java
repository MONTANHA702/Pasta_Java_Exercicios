package revisao.collections.conjuntos.ex03treeset;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Contato> contatos = new TreeSet<>(new IdadeContatoComparator().reversed());
        //muito cuidado com essa comparação, pois ela define que 2 objetos são iguais
        //pela idade, nào leva em conta o nome ou email
        //uma boa prática é usar sempre o mesmo critério do equals

        contatos.add(new Contato("Maria", "maria@email.com", 40));
        contatos.add(new Contato("Jose", "jose2email.com", 30));
        contatos.add(new Contato("João", "joao@email.com", 25));
        contatos.add(new Contato("Rosa", "rosa@email.com", 50));


        for (Contato contato : contatos) {
            System.out.println(contato);
        }

    }
}
