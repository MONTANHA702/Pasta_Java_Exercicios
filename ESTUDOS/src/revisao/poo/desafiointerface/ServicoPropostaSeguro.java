package revisao.poo.desafiointerface;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem) {
        System.out.println("===PROPOSTA SEGURO===");
        System.out.println(bem.descrever());
        System.out.printf("Premio: R$ %.2f%n", bem.calcularValorPremio());

    }
}
