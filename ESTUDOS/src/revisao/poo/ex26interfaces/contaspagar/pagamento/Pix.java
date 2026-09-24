package revisao.poo.ex26interfaces.contaspagar.pagamento;


public class Pix implements MetodoPagamento {
    @Override
    public void pagar(DocumentoPagavel documento) {

        Beneficiario beneficiario = documento.getBeneficiario();

        if(beneficiario.naoPossuiChavePix()) {
            throw new RuntimeException("Beneficiário não possui chave Pix.");
        }
        System.out.printf("DEBUG: Efetuando PIX para %S no valor de R$ %.2f" +
                        " com a chave PIX: %s%n", beneficiario.getNome(), documento.getValorTotal(),
                beneficiario.getChavePix());



    }
}
