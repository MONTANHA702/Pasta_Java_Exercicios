package revisao.Poo.Ex12MetodosQueAlteramEstadoObjetoRecebidoComoParametro;

public class Main {
    public static void main(String[] args) {

        Produto novoProduto = new Produto();
        novoProduto.precoCompra = 100;


        ServicoDePrecificacao novoPreco = new ServicoDePrecificacao();
        novoPreco.definirPrecoVenda(novoProduto, 30);
        System.out.println("Valor de venda: R$ " + novoProduto.precoVenda);









    }
}
