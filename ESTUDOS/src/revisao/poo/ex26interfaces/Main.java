package revisao.poo.ex26interfaces;

import revisao.poo.ex26interfaces.contaspagar.modelo.Holerite;
import revisao.poo.ex26interfaces.contaspagar.modelo.OrdemDeServico;
import revisao.poo.ex26interfaces.contaspagar.pagamento.Beneficiario;
import revisao.poo.ex26interfaces.contaspagar.pagamento.MetodoPagamento;
import revisao.poo.ex26interfaces.contaspagar.pagamento.Pix;
import revisao.poo.ex26interfaces.contaspagar.servico.ServicoContaPagar;

public class Main {
    public static void main(String[] args) {

        MetodoPagamento metodoPagamento = new Pix();
        ServicoContaPagar servico = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("Joao", "1234", "1234567");
        Holerite holerite = new Holerite(funcionario, 100, 160);

        //aqui ocorre um casting implícito porque Holerite é filha de DocumentoPagavel
        servico.pagar(holerite);

        Beneficiario fornecedor = new Beneficiario("Consultoria Joao", "1234000187", "1234567");
        OrdemDeServico os = new OrdemDeServico(fornecedor, 65_000);

        servico.pagar(os);




    }
}
