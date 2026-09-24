package revisao.poo.ex26interfaces.contaspagar.pagamento;

public class Transferencia implements MetodoPagamento {

    @Override
    public void pagar(DocumentoPagavel documento) {

        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiContaBancaria()) {
            throw new RuntimeException("Beneficiário não possui conta bancaria.");
        }
        System.out.printf("DEBUG: Efetuando PIX para %S no valor de R$ %.2f" +
                        " para a CONTA: %s%n", beneficiario.getNome(), documento.getValorTotal(),
                beneficiario.getContaBancaria());


    }
}
