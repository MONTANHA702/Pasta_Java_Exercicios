package revisao.generics.ex04criandoclassesgenerics;

import java.util.Arrays;

//objetivo é fazer a classe Pilhar poder ser utilizada para varios tipos
//sem precisar fazer casting no main
//Pilha<T extends Produto> quer dizer que aceita somento Produtos e suas subclasses
public class Pilha<T> {

    private T[] itens;

    public Pilha() {
        itens = (T[]) new Object[0];
    }

    public void colocar(T item) {
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;
    }

    public T retirar() {
        if(itens.length == 0) {
            throw new PilhaVaziaException("Pilha sem itens.");
        }
        T item = itens[itens.length - 1];
        itens = Arrays.copyOf(itens, itens.length - 1);

        return item;
    }
}
