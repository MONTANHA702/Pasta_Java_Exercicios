package revisao.enumeracoes.ex03metodos;

//e se quisermos inserir mais um status, corre o risco de não implementarmos
//nos métodos, causando erro no código.
//para isso implementamos métodos abstrados para serem instanciados nas
//constantes.
//Isso obriga o desenvolvedor a implementar o método na constante
//impedindo o erro.
//Desvantagem é que escreve mais código.

public enum StatusPedido {

    RASCUNHO {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return true;
        }
    },
    EMITIDO(12) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return valorPedido < 100;
        }
    },
    EM_ANALISE(11) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return valorPedido < 100;
        }
    },//novo status inserido
    FATURADO(10) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return  false;
        }
    },
    DESPACHADO(6) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    },
    ENTREGUE(0) {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    },
    CANCELADO {
        @Override
        public boolean podeMudarParaCancelado(double valorPedido) {
            return false;
        }
    };

    private Integer tempoEntregaHoras;

    StatusPedido() {
    }

    StatusPedido(Integer tempoEntregaHoras) {
        this.tempoEntregaHoras = tempoEntregaHoras;
    }

    public Integer getTempoEntregaHoras() {
        return tempoEntregaHoras;
    }

    public abstract boolean podeMudarParaCancelado(double valorPedido);


}
