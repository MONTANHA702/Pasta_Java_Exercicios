package revisao.enumeracoes.ex01enum;

public class Main2 {
    public static void main(String[] args) {

        //System.out.println(StatusPedido.EMITIDO.ordinal());
        //String status = StatusPedido.EMITIDO.name();
        //System.out.println(status);

        for (StatusPedido1 status : StatusPedido1.values()) {
            System.out.println(status.ordinal());
        }

        separador();

        for(StatusPedido1 status : StatusPedido1.values()){
            System.out.printf("%d - %s%n", status.ordinal(), status.name());
        }

        separador();





    }

    private static void separador(){
        System.out.println("-----------");
    }
}
