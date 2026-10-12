package revisao.enumeracoes.ex03metodos;

//evite true ou false
//crie enums para deixar o código mais amigável
public class ServicoCancelamentoCliente {

    public void cancelar(Pedido pedido, TipoUsuario tipoUsuario){
        pedido.cancelar();

        if(TipoUsuario.CLIENTE.equals(tipoUsuario)){
            System.out.println("Notificando gerente sobre cancelamento do pedido.");
        }
    }
}
