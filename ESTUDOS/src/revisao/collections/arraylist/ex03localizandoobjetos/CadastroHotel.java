package revisao.collections.arraylist.ex03localizandoobjetos;

import java.util.ArrayList;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    public void adicionar(Hotel hotel) {
        if (hoteis.contains(hotel)) {
            throw new CadastroDuploException("Hotel já cadastrado.");
        }
        hoteis.add(hotel);
    }
    public ArrayList<Hotel> obterTodos() {
        return hoteis;
    }
}
