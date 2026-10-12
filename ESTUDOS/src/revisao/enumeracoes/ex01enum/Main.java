package revisao.enumeracoes.ex01enum;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setStatus(StatusPedido1.EMITIDO);
        pedido.setOrigem(OrigemPedido.BALCAO);

        System.out.println(pedido.getStatus());
        System.out.println(pedido.getOrigem());
    }
}
