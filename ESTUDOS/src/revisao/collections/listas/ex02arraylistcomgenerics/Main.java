package revisao.collections.listas.ex02arraylistcomgenerics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Hotel hotel1 = new Hotel("Arpoador", "Porto de Galinhas", 400);
        Hotel hotel2 = new Hotel("Soleil", "Los Angeles", 1_000);
        Hotel hotel3 = new Hotel("Hotel da Vovó", "São Paulo", 1_200);

        CadastroHotel cadastroHotel = new CadastroHotel();
        cadastroHotel.adicionar(hotel1);
        cadastroHotel.adicionar(hotel2);
        cadastroHotel.adicionar(hotel3);

        ArrayList<Hotel> hoteis = cadastroHotel.obterTodos();
        imprimir(hoteis);

    }

    private static void imprimir(ArrayList<Hotel> hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%d - %S (%s) -> R$ %.2f%n", (i+1),
                    hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());

        }
    }


}
