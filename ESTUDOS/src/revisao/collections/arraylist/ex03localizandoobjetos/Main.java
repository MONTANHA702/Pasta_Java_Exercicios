package revisao.collections.arraylist.ex03localizandoobjetos;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Hotel hotel1 = new Hotel("Arpoador", "Porto de Galinhas", 400);
        Hotel hotel2 = new Hotel("Soleil", "Los Angeles", 1_000);
        Hotel hotel3 = new Hotel("Hotel da Vovó", "São Paulo", 1_200);
        Hotel hotel4 = new Hotel("Eno Hotel", "Porto de Galinhas", 1_100);
        Hotel hotel5 = new Hotel("Hotel da Titia", "Maragogi", 1_600);

        CadastroHotel cadastroHotel = new CadastroHotel();
        cadastroHotel.adicionar(hotel1);
        cadastroHotel.adicionar(hotel2);
        cadastroHotel.adicionar(hotel3);
        cadastroHotel.adicionar(hotel4);
        cadastroHotel.adicionar(hotel5);


        //chamado o metodo equals and hashtag para evitar duplicação
        Hotel hotel6 =new Hotel("Hotel da Família", "Maragogi", 1_600);
        cadastroHotel.adicionar(hotel6);


        ArrayList<Hotel> hoteis = cadastroHotel.obterTodos();
        imprimir(hoteis);

        System.out.println("==========");

        //encontrar objetos na lista
        //System.out.println(hoteis.indexOf(new Hotel("Eno Hotel", "Porto de Galinhas", 0)));
        int indice = hoteis.indexOf(hotel3);
        System.out.println(indice);

    }

    private static void imprimir(ArrayList<Hotel> hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%d - %S (%s) -> R$ %.2f%n", (i+1),
                    hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());

        }
    }

}
