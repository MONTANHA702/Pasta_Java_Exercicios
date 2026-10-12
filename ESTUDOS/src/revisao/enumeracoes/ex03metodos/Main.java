package revisao.enumeracoes.ex03metodos;

public class Main {
    public static void main(String[] args) {

        var servico = new ServicoCancelamentoCliente();

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("Mariazinha");
        pedido.setValorTotal(90);
        pedido.setStatus(StatusPedido.EMITIDO);

        servico.cancelar(pedido, TipoUsuario.CLIENTE);

        System.out.println(pedido.getStatus());
    }
}
