package revisao.poo.ex24polimorfismo;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;
    public static final double TARIFA_IMPRESSAO_DEMONSTRATIVO = 5;


//    public void transferir(ContaEspecial contaOrigem, ContaEspecial contaDestino,
//                           double valorTransferencia) {
//        System.out.printf("Transferencia R$ %.2f da conta %S para %S%n",
//                valorTransferencia, contaOrigem, contaDestino);
//
//        contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
//        contaDestino.depositar(valorTransferencia);
//    }

    //faz o UPCASTING da conta
    public void transferir(Conta contaOrigem, Conta contaDestino,
                           double valorTransferencia) {
        System.out.printf("Transferencia R$ %.2f da conta %S para %S%n",
                valorTransferencia, contaOrigem, contaDestino);

        contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);
    }

    public void imprimirDemonstrativo(Conta conta) {
        //DOWNCASTING
        //não é boa prática, pois se pegar uma classe que não seja filha
        //dá erro ClassCastException
        //então coloca-se um controle com instanceof


        if (conta instanceof ContaInvestimento contaInvestimento
                && contaInvestimento.getValorTotalRendimentos() > 0) {
            //declarando a variável contaInvestimento elimina a linha de baixo
            //ContaInvestimento contaInvestimento = (ContaInvestimento) conta;

            System.out.println("Impressão do demonstrativo é grátis.");
        } else {
            debitarTarifaImpressaoDemonstrativo(conta);
        }

        conta.imprimirDemonstrativo();
    }

    private static void debitarTarifaImpressaoDemonstrativo(Conta conta) {
        System.out.printf("Custo da impressão: R$ %.2f%n", TARIFA_IMPRESSAO_DEMONSTRATIVO);
        conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
    }
}
