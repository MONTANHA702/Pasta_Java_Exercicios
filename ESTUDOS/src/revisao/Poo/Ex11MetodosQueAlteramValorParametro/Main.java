package revisao.Poo.Ex11MetodosQueAlteramValorParametro;

public class Main {
    public static void main(String[] args) {

        ServicoDePrecificacao novoServico = new ServicoDePrecificacao();

        double valorCompraFornecedor = 140;
        novoServico.calcularPrecoVenda(valorCompraFornecedor);//altera e morre no proprio metodo
        System.out.println(valorCompraFornecedor);//140

        //forma correta
//        double novoPreco = novoServico.calcularPrecoVenda(valorCompraFornecedor);
//        System.out.println(novoPreco);
    }
}
