package revisao.poo.ex27interfaces2;

import revisao.poo.ex27interfaces2.servico.ServicoFinanciamento;

public class Main {
    public static void main(String[] args) {

        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda da Vovó", 5_000_000, 5);
        var industria = new Industria("Industria de Alimentos", 900_000, true);
        var funcionario = new Funcionario("Manoel", 12_000);

        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
        servicoFinanciamento.solicitarFinanciamento(industria, 500_000);
        servicoFinanciamento.solicitarFinanciamento(funcionario, 50_000);

        System.out.printf("Juros baixo risoc: %.1f%%%n", ClienteFinanciavel.JUROS_BAIXO_RISCO);

    }
}
