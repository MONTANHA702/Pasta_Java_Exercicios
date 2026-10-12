package revisao.enumeracoes.desafio;

public enum StatusNota {

    NAO_EMITIDA("Nao emitida") {
        @Override
        public boolean possoMudarParaCancelado(double valor) {
            return true;
        }

        @Override
        public boolean podeMudarParaEmitido(double valor) {
            return true;
        }
    },
    EMITIDA("Emitida") {
        @Override
        public boolean possoMudarParaCancelado(double valor) {
            return valor < 1_000;
        }
        @Override
        public boolean podeMudarParaEmitido(double valor) {
            return false;
        }
    },
    CANCELADA("Cancelada") {
        @Override
        public boolean possoMudarParaCancelado(double valor) {
            return false;
        }
        @Override
        public boolean podeMudarParaEmitido(double valor) {
            return false;
        }
    };

    private String descricao;

    StatusNota(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract boolean possoMudarParaCancelado(double valor);
    public abstract boolean podeMudarParaEmitido(double valor);
}
