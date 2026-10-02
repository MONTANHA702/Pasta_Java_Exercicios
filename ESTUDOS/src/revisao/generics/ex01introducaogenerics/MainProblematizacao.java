package revisao.generics.ex01introducaogenerics;

import java.util.ArrayList;

public class MainProblematizacao {
    public static void main(String[] args) {

        //Note que é um ArrayList cru, sem<>
        //então aceita qualquer tipo dentro dele
        ArrayList clientes = new ArrayList();
        clientes.add(new Cliente("Supermercado Joia", 1_000_000));//Cliente
        clientes.add(new Cliente("Posto J", 800_000));//Cliente
        clientes.add("Jose"); //String

        double totalFaturamento = 0d;

        //ArrayList retorna elementos do tipo Object
        for (Object objeto : clientes) {
            //casting objeto tipo cliente
            //codigo quebra pq também foi adicionado um String
            Cliente cliente = (Cliente) objeto;

            totalFaturamento += cliente.getFaturamentoMensal();
        }

        System.out.println("Total: " + totalFaturamento);
    }
}
