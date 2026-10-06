package revisao.collections.listas.ex04percorrendolistacomiterador;

import java.util.*;

public class CadastroHotel {

    //deixando mais genérico
    private final List<Hotel> hoteis = new ArrayList<>();

    //private final ArrayList<Hotel> hoteis = new ArrayList<>();
    //private final LinkedList<Hotel> lista = new LinkedList<>();
    //private final Vector<Hotel> hotels = new Vector<>();
    //O VECTOR é praticamente igual ao ARRAYLIST, a diferença está em um processo
    //interno que impede duas ações ao mesmo tempo. No Vector,
    //termina-se uma ação para iniciar outra.


    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);
        if(hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel já cadastrado");
        }
        hoteis.add(hotel);
    }

    public List<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerPorCidade(String nome) {
        Iterator<Hotel> hotelIterator = hoteis.iterator();
        while (hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();
            if (hotel.getCidade().equals(nome)) {
                hotelIterator.remove();
            }
        }
    }

    //transformando lista em array
    public Hotel[] obterTodosComoArray() {
        return hoteis.toArray(new Hotel[0]);//esse [0] é um padrao
    }

    //ordenar
    public void ordenar() {
        Collections.sort(hoteis);
    }

    public void ordenarPorPreco() {
        //Collections.sort(hoteis, new PrecoHotelComparator().reversed());
        hoteis.sort(new PrecoHotelComparator().reversed());
               // .thenComparing(Comparator.naturalOrder()));//inserindo outro critério
    }


}
