package revisao.Poo.DesafioArrayList;

import java.util.ArrayList;

public class Cardapio {
    ArrayList<ItemCardapio> itens = new ArrayList<>();

    void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    void removerItem(int indice) {
        itens.remove(indice);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                item.imprimir();
            }
        }
    }

    //METODO RETORNA UM OBJETO
    ArrayList<ItemCardapio> consultarItensPorPreco(double precoMinimo, double precoMaximo) {

        ArrayList<ItemCardapio> itensEncontrados = new ArrayList<>();

        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                itensEncontrados.add(item);
            }
        }

        //MÁ PRATICA: evite retornar null  por causa do NullPointException
        //return itensEncontrados.isEmpty() ? null : itensEncontrados;

        //BOA PRATICA: retorne sempre o objeto instanciado
        return itensEncontrados;


    }
}
