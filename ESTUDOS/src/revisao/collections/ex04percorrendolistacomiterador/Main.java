package revisao.collections.ex04percorrendolistacomiterador;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);


        ArrayList<Hotel> hoteis = cadastro.obterTodos();
        imprimirHotel(hoteis);

    }

    private static void imprimirHotel(ArrayList<Hotel> hoteis) {
        Iterator<Hotel> HotelIterator = hoteis.iterator();
        while (HotelIterator.hasNext()) {//hasNext verifica se tem próximo
            Hotel hotel = HotelIterator.next();//next mostra
            System.out.printf("%S (%s) -> R$ %.2f%n",
                    hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }

    private static void separar() {
        System.out.println("==============");
    }
}
