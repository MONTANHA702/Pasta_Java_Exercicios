package revisao.enumeracoes.ex01enum;

public class Pedido {

    private String nomeCliente;
    private StatusPedido1 status = StatusPedido1.RASCUNHO;
    private OrigemPedido origem = OrigemPedido.BALCAO;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public StatusPedido1 getStatus() {
        return status;
    }

    public void setStatus(StatusPedido1 status) {
        this.status = status;
    }

    public OrigemPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemPedido origem) {
        this.origem = origem;
    }
}
