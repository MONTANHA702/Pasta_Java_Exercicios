package revisao.poo.ex12metodosquealteramestadoobjetorecebidocomoparametro;

public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {

        //preciso do preco de compra da classe produto
        produto.precoVenda = produto.precoCompra*(1 +(percentualMargemLucro / 100));
    }
}
