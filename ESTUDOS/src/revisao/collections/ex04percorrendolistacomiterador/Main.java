package revisao.collections.ex04percorrendolistacomiterador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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

    //usando iterator
//    private static void imprimirHotel(ArrayList<Hotel> hoteis) {
//        Iterator<Hotel> hotelIterator = hoteis.iterator();
//        while (hotelIterator.hasNext()) {//hasNext verifica se tem próximo
//            Hotel hotel = hotelIterator.next();//next mostra
//            System.out.printf("%S (%s) -> R$ %.2f%n",
//                    hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }
//    }

    //usando listIterator
    //mais avançado que o iterator, permite que se percorra nos dois sentidos
    //iterando para trás não pode começar do index 0
//    private static void imprimirHotel(ArrayList<Hotel> hoteis) {
//        ListIterator<Hotel> hotelIterator = hoteis.listIterator(hoteis.size());//começa do final
//        while (hotelIterator.hasPrevious()) {//hasPrevious verifica se tem anterior
//            Hotel hotel = hotelIterator.previous();//previous mostra
//            System.out.printf("%S (%s) -> R$ %.2f%n",
//                    hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
//        }

    //usando o enhanced for
    private static void imprimirHotel(ArrayList<Hotel> hoteis) {
        for (Hotel hotel : hoteis) {
            System.out.printf("%S (%s) -> R$ %.2f%n",
                    hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }

    private static void separar() {
        System.out.println("==============");
    }
}
