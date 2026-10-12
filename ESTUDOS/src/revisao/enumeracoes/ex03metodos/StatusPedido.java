package revisao.enumeracoes.ex03metodos;

public enum StatusPedido {

    RASCUNHO,
    EMITIDO(12),
    FATURADO(10),
    DESPACHADO(6),
    ENTREGUE(0),
    CANCELADO;

    private Integer tempoEntregaHoras;

    StatusPedido() {
    }

    StatusPedido(Integer tempoEntregaHoras) {
        this.tempoEntregaHoras = tempoEntregaHoras;
    }

    public Integer getTempoEntregaHoras() {
        return tempoEntregaHoras;
    }

    public boolean podeMudarParaCancelado(double valorPedido) {
        return StatusPedido.RASCUNHO.equals(this) ||
                StatusPedido.EMITIDO.equals(this) && valorPedido < 100;
    }


}
