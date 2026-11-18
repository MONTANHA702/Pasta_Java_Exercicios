package revisao.streamsapi.ex01stringapi.desafio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main7 {
    public static void main(String[] args) {

        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        Map<String, Long> vendasRealizadasPorCliente = new HashMap<>();

        for (Venda venda : vendas) {
            if (venda.isFechada()) {
                String nomeCliente = venda.getCliente().nome();
                Long quantidadeVendas = vendasRealizadasPorCliente.get(nomeCliente);
                if (quantidadeVendas == null) {
                    quantidadeVendas = 0L;
                }

                vendasRealizadasPorCliente.put(nomeCliente, quantidadeVendas + 1);
            }
        }

        System.out.println(vendasRealizadasPorCliente);

        System.out.println("-----");

        Map<String, Long> vendasRealizadasPorCliente2 = vendas.stream()
                .filter(Venda::isFechada)
                .collect(Collectors.groupingBy(venda -> venda.getCliente().nome(), Collectors.counting()));
        System.out.println(vendasRealizadasPorCliente2);

    }
}
