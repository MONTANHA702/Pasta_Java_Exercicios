package revisao.collections.mapas.ex01hashmap;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Proprietario maria = new Proprietario("Maria", "05566712343");
        Proprietario ana = new Proprietario("Ana", "05566712345");
        Proprietario jose = new Proprietario("José", "05566712346");
        Proprietario joao = new Proprietario("João", "05566712347");

        Carro bmw = new Carro("QDK4022", "BMW X3");
        Carro honda = new Carro("WOR2231", "Honda HR-V");
        Carro ford = new Carro("AAA3212", "Ford Ka");
        Carro porshe = new Carro("RIC1111", "Porshe Carrera");

        //Declarar um Map com CHAVE, VALOR
        Map<Carro, Proprietario> proprietarios = new HashMap<>();
        proprietarios.put(bmw, maria);
        proprietarios.put(honda, ana);
        proprietarios.put(ford, jose);
        proprietarios.put(porshe, maria);

        //visualização do mapa
        //System.out.println(proprietarios);

        //busca só por chaves
        System.out.println(proprietarios.get(ford));
        System.out.println(proprietarios.get(new Carro("WOR2231", "BMW X3")));
        System.out.println(proprietarios.get(new Carro("AAA2231", "Honda HR-V")));
        separador();

//        Set<Carro> chaves = proprietarios.keySet();
//        for (Carro carro : chaves) {}

        //iterar chaves
        System.out.println("Iterar pelas chaves .keySet()");
        //.keySet() mostra uma lista de chaves da variavel proprietarios que é do tipo map
        for (Carro carro : proprietarios.keySet()) {
            System.out.println(carro);
        }
        separador();
        //iterar valores
        //.values()
        System.out.println("Iterar pelos valores .values()");
        for (Proprietario proprietario : proprietarios.values()) {
            System.out.println(proprietario);
        }
        separador();

        //iterar com chave e valor juntos
        //.entrySet()
        System.out.println("Iterar pelos valores .entrySet()");

        //for (Map.Entry<Carro, Proprietario> entry : proprietarios.entrySet()) {
        for (var entry : proprietarios.entrySet()) {
            System.out.printf("%s (%s) -> %s%n", entry.getKey().getModelo(), entry.getKey().getPlaca(),
                    entry.getValue().getNome());
        }

        separador();

        System.out.println("Trocando valores com chaves existentes");
        proprietarios.put(bmw, joao);

        for (var entry : proprietarios.entrySet()) {
            System.out.printf("%s (%s) -> %s%n", entry.getKey().getModelo(), entry.getKey().getPlaca(),
                    entry.getValue().getNome());
        }

        separador();

        System.out.println("Removendo objetos existentes");
        proprietarios.remove(bmw);
        //proprietarios.remove(new Carro("WOR2231", "xxxxx"));
        for (var entry : proprietarios.entrySet()) {
            System.out.printf("%s (%s) -> %s%n", entry.getKey().getModelo(), entry.getKey().getPlaca(),
                    entry.getValue().getNome());
        }

        separador();
        System.out.println("Removendo chaves e valores existentes");
        //chave nao pode duplicar, então só pode ter uma null
        //valores pode duplicar, então pode ter vários null
        proprietarios.put(ford, null);
        proprietarios.put(null, maria);
        System.out.println(proprietarios);
        separador();

        System.out.println("O Hashtable é um legado que trabalha quando o mapa está\n" +
                "sendo alterado por varias pessoas ao mesmo tempo (threads). Ele é igual\n" +
                "ao HashMap porém não aceita nem chave e nem valor nulos.");

        //Map<Proprietario, Carro> proprietarios = new Hashtable<>();
        separador();
        System.out.println("LinkedHashMap funciona igual ao hashMap, porém tem um\n" +
                "custo maior de memória. Ele agrupa EM ORDEM de inclusão e aceita\n" +
                "null");

        //Map<Proprietario, Carro> proprietarios = new LinkedHashMap<>();

        separador();
        System.out.println("O TreeMap não possui árvore de espalhamento, ele agrupa\n" +
                "pela ordem natural ou por comparator. Para usar é necessário que a\n" +
                "classe implemente Comparable ou se use uma classe Coparator, igual\n" +
                "no estudo dos conjuntos(treeSet). Não aceita chaves null.");

        //Map<Proprietario, Carro> proprietarios = new TreeMap<>();
        //class Carro implements Comparable<Carro> - implementa o método compareTo

        separador();
        System.out.println("TreeMap é mais lento que o HashMap porém consome menos\n" +
                "memória.");
    }

    private static void separador() {
        System.out.println("=========");
    }
}
