package revisao.enumeracoes.ex03metodos;


import revisao.enumeracoes.ex01enum.OrigemPedido;

public class Pedido {

    private String nomeCliente;
    private int valorTotal;
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

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
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

    public void cancelar() {//implementei a regra de negócio no enum StatusPedido
        if (getStatus().podeMudarParaCancelado(getValorTotal())) {
            status = StatusPedido.CANCELADO;
        } else {
            throw new IllegalArgumentException("Pedido não pode ser cancelado");
        }

    }

    public void marcarComoEntregue() {
        status = StatusPedido.ENTREGUE;
    }

    public void emitir() {
        status = StatusPedido.EMITIDO;
    }


}
