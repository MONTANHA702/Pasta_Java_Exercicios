package revisao.poo.ex27interfaces2.servico;

import revisao.poo.ex27interfaces2.PessoaBonificavel;

public class ServicoPagamentoBonus {

    public void pagarBonus(PessoaBonificavel pessoa, double percentualMetaAlcancada) {
        double valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);
        System.out.printf("DEBUG: bônus pago no valor de %.2f para %S%n ", valorBonus, pessoa.toString());
    }
}
