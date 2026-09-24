package revisao.poo.ex26interfaces.contaspagar.modelo;

import revisao.poo.ex26interfaces.contaspagar.pagamento.Beneficiario;
import revisao.poo.ex26interfaces.contaspagar.pagamento.DocumentoPagavel;

public class OrdemDeServico implements DocumentoPagavel {

    private Beneficiario fornecedor;
    private double valorTotal;

    public OrdemDeServico(Beneficiario fornecedor, double valorTotal) {
        this.fornecedor = fornecedor;
        this.valorTotal = valorTotal;
    }

    public Beneficiario getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Beneficiario fornecedor) {
        this.fornecedor = fornecedor;
    }


    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public Beneficiario getBeneficiario() {
        return getFornecedor();
    }
}
