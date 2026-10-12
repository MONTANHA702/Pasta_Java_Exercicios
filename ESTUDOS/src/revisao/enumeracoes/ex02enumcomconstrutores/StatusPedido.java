package revisao.enumeracoes.ex02enumcomconstrutores;

//diferente das classes, nos enuns com construtores
//as constantes são instanciadas nelas próprias.

public enum StatusPedido {

    RASCUNHO,
    EMITIDO(12),
    FATURADO(10),
    DESPACHADO(6),
    ENTREGUE(0),
    CANCELADO;

    private Integer tempoEntregaHoras;

   //construtores
    //como existem constantes que nao recebem parametros criamos um
    //construtor vazio também

    StatusPedido(){
    }

    StatusPedido(Integer tempoEntregaHoras) {
        this.tempoEntregaHoras = tempoEntregaHoras;
    }


    public Integer getTempoEntregaHoras() {
        return tempoEntregaHoras;
    }
}
