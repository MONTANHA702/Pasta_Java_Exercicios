package revisao.collections.listas.ex03localizandoobjetos;

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

    public void removerPorCidades(String nome) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            if (hotel.getCidade().equals(nome)) {
                hoteis.remove(i);
                i--;
            }
        }
    }
}
