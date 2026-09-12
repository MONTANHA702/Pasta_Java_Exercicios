package revisao.poo.desafioencapsulamentojavabeans;

public class Main {

    public static void main(String[] args) {

        Fornecedor imobiliaria = new Fornecedor("Zé Negócios Ltda");

        ContaPagar contaAluguel = new ContaPagar();
        contaAluguel.setDescricao("Aluguel de Apartamentos");
        contaAluguel.setValor(4500);
        contaAluguel.setDataVencimento("10/09/2026");
        contaAluguel.setFornecedor(imobiliaria);

        imprimirConta(contaAluguel);

        contaAluguel.pagar();
        imprimirConta(contaAluguel);

        //contaAluguel.pagar();

        contaAluguel.cancelarPagamento();
        imprimirConta(contaAluguel);
        //contaAluguel.cancelarPagamento();

    }

    public static void imprimirConta(ContaPagar conta) {
        System.out.println("------------");
        System.out.println("Fornecedor: " + conta.getFornecedor().getNome());
        System.out.println("Tipo: " + conta.getDescricao());
        System.out.println("Vencimento: " + conta.getDataVencimento());
        System.out.printf("Valor: R$ %.2f%n", conta.getValor());
        System.out.println("Status pagamento: " + (conta.isPago() ? "Conta paga": "Conta não paga"));
        System.out.println("------------");
    }
}
