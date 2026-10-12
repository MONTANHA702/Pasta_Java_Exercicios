package revisao.enumeracoes.ex02enumcomconstrutores;

public class MainStatusPedido2 {
    public static void main(String[] args) {

        Pedido2 pedido2 = new Pedido2();
        pedido2.setNomeCliente("Joaozinho");
        pedido2.setStatus(StatusPedido.EMITIDO);

        System.out.println(pedido2.getTempoEntregaHoras());


    }
}
