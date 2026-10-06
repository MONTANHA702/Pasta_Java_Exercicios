package revisao.collections.listas.ex01usandoarraylist;
//objetivo é usar um arraylist cru para fazer uma lista
//verifique que sempre cai na situação de casting
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CadastroHotel cadastro  = new CadastroHotel();
        cadastro.adicionar("Summer Ville", "Porto de Galinhas", 2_300);
        cadastro.adicionar("Enno Hotel", "Porto de Galinhas", 1_900);

        //System.out.println(cadastro.obterTodos());

        Hotel hotel = (Hotel) cadastro.obterTodos().get(1);
        System.out.println(hotel.getNome());

        //iterar usando o for resumido
        ArrayList hoteis = cadastro.obterTodos();
        for(Object item : hoteis) {
            System.out.println(item);
        }

        //iterar usando o for completo usei um metodo externo
        imprimir(hoteis);

    }
    private static void imprimir(ArrayList hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            //casting
            Hotel hotel = (Hotel) hoteis.get(i);
            System.out.printf("%d - %S (%s) -> %.2f%n",(i+1),
                    hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria() );


        }
    }
}
