package revisao.generics.ex01introducaogenerics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //var clientes = new ArrayList<Cliente>();
        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Supermercado Joia", 1_000_000));//Cliente
        clientes.add(new Cliente("Posto J", 800_000));//Cliente
        //clientes.add("Jose"); //String

        double totalFaturamento = 0d;


        for (Cliente cliente : clientes) {

            totalFaturamento += cliente.getFaturamentoMensal();
        }

        System.out.printf("Total: R$ %.2f%n", totalFaturamento);
    }


}
