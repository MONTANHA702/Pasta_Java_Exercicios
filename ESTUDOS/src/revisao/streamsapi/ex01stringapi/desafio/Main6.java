package revisao.streamsapi.ex01stringapi.desafio;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) {

        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        List<String> clientes = new ArrayList<>();

        for (Venda venda : vendas) {
            if (venda.isFechada()) {
                if (!clientes.contains(venda.getCliente().nome())) {
                    clientes.add(venda.getCliente().nome());
                }
            }
        }

        Collections.sort(clientes);
        System.out.println(clientes);

        System.out.println("-----");

        List<String> lista = vendas.stream()
                .filter(Venda::isFechada)
                .map(Venda::getCliente)
                .map(Cliente::nome)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(lista);

    }
}
