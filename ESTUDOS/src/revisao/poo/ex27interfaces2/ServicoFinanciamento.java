package revisao.poo.ex27interfaces2;

public class ServicoFinanciamento {

    public void solicitarFinanciamento(ClienteFinanciavel cliente, double valorSolicitado) {
        double limiteAprovado = cliente.calcularLimiteAprovado();

        if (limiteAprovado < valorSolicitado) {
            throw new RuntimeException(String.format(
                    "Financiamento não aprovado. Limite máximo de %.2f", limiteAprovado));
        }
        System.out.printf("DEBUG: Financiamento aprovado. Limite máximo de <R$ %.2f>%n",limiteAprovado);
    }

    public double consultarLimiteAprovado(ClienteFinanciavel cliente) {
        return cliente.calcularLimiteAprovado();
    }
}
