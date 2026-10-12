package revisao.enumeracoes.ex02enumcomconstrutores;

import revisao.enumeracoes.ex01enum.OrigemPedido;

public class Pedido2 {

    private String nomeCliente;
    private StatusPedido status = StatusPedido.RASCUNHO;
    private OrigemPedido origem = OrigemPedido.BALCAO;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public OrigemPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemPedido origem) {
        this.origem = origem;
    }

    public Integer getTempoEntregaHoras() {
        return status.getTempoEntregaHoras();
    }
}
