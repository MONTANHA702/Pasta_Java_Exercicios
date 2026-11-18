package revisao.streamsapi.ex01stringapi.desafio;

import java.math.BigDecimal;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {

        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        BigDecimal totalVendas = BigDecimal.ZERO;
        for (Venda venda : vendas) {
            if (venda.isFechada()) {
                totalVendas = totalVendas.add(venda.getValorTotal());
            }
        }

        System.out.println(totalVendas);

        System.out.println("-----");

        BigDecimal valorTotalVendasFechadas = vendas.stream()
                .filter(Venda::isFechada)
                .map(Venda::getValorTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.printf("Valor total de vendas fechadas: R$ %.2f%n", valorTotalVendasFechadas);

    }

}
