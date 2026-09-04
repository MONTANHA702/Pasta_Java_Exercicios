package revisao.Poo.DesafioArrays;

import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    void adicionarItem(ItemCardapio item) {
        this.itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;//recebe no indice (length -1)
    }

    void removerItem(int indiceExclusao) {
       ItemCardapio[] novosItens = new ItemCardapio[itens.length - 1];

        System.arraycopy(itens, 0,
           novosItens , 0, indiceExclusao);

        System.arraycopy(itens, indiceExclusao + 1,
                novosItens, indiceExclusao, novosItens.length - indiceExclusao);

        itens = novosItens;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
       for(ItemCardapio item : itens) {
           if(item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
               item.imprimir();
           }
       }
    }
}
