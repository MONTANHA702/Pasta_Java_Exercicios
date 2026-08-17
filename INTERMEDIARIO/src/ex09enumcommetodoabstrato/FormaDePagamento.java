package ex09enumcommetodoabstrato;

public enum FormaDePagamento {

    DINHEIRO(10) {
        @Override
        public double calcularDesconto(double valor) {
            return valor*getTaxaDesconto()/100;
        }
    },
    CARTAO(0) {
        @Override
        public double calcularDesconto(double valor) {
            return valor*getTaxaDesconto()/100;
        }
    },
    PIX(5) {
        @Override
        public double calcularDesconto(double valor) {
            return valor*getTaxaDesconto()/100;
        }
    };

    private double taxaDesconto;

    FormaDePagamento(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public double getTaxaDesconto() {
        return taxaDesconto;
    }

    public abstract double calcularDesconto(double valor);
}
