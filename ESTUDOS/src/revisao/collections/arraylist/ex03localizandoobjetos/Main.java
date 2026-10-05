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

        separar();

        //encontrar objetos na lista
        //System.out.println(hoteis.indexOf(new Hotel("Eno Hotel", "Porto de Galinhas", 0)));
        int indice = hoteis.indexOf(hotel3);
        System.out.println(indice);

        separar();
        System.out.println("Inserindo na posição desejada");
        //.add sempre adiciona objeto no final
        //para colocar em outras posicoes usa-se parametros no .add
        Hotel hotel7 = new Hotel("Hotel 7", "Teste", 0);
        cadastroHotel.adicionar(hotel7);
        hoteis.add(3, hotel7);
        imprimir(hoteis);

       separar();
        System.out.println("Substituindo objeto com .set");

        Hotel hotel8 = new Hotel("Hotel 8", "Teste", 1);
        cadastroHotel.adicionar(hotel8);
        hoteis.set(3, hotel8);
        imprimir(hoteis);

        separar();
        System.out.println("Retirando objeto com .remove");
        cadastroHotel.removerPorCidades("Teste");
        imprimir(hoteis);

        separar();
        System.out.println("Apagar lista");
        hoteis.clear();
        //hoteis.removeAll(hoteis);//apaga todos os elementos de uma colecao informada
        imprimir(hoteis);




    }

    private static void imprimir(ArrayList<Hotel> hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%d - %S (%s) -> R$ %.2f%n", (i+1),
                    hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());

        }
    }

    private static void separar() {
        System.out.println("=============");
    }

}
