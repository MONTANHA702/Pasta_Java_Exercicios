package revisao.enumeracoes.ex03metodos;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("Mariazinha");
        pedido.setValorTotal(190);
//        pedido.marcarComoEntregue();
        pedido.emitir();
        pedido.cancelar();

        System.out.println(pedido.getStatus());
    }
}
