package revisao.collections.mapas.ex01hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

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

        //busca
        //System.out.println(proprietarios.get(ford));
        System.out.println(proprietarios.get(new Carro("WOR2231", "BMW X3")));
        System.out.println(proprietarios.get(new Carro("AAA2231", "Honda HR-V")));
        separador();

//        Set<Carro> chaves = proprietarios.keySet();
//        for (Carro carro : chaves) {}

        //iterar chaves
        System.out.println("Iterar pelas chaves .keySet()");
        //.keySet() mostra uma lista de chaves da variavel proprietarios que é do tipo map
        for(Carro carro : proprietarios.keySet()) {
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
    }

    private static void separador() {
        System.out.println("=========");
    }
}
