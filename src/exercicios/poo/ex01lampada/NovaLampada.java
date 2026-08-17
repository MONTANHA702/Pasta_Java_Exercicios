package exercicios.poo.ex01lampada;

import java.util.concurrent.Callable;

public class NovaLampada {
    public static void main(String[] args) {

        ClasseLampada lampada1 = new ClasseLampada();
        lampada1.cor = "Branca";
        lampada1.potencia = 25;
        lampada1.tamanho = "Medio";
        lampada1.preco = 17.80;

        ClasseLampada lampada2 = new ClasseLampada();
        lampada2.cor = "Amarela";
        lampada2.potencia = 17;
        lampada2.tamanho = "Pequeno";
        lampada2.preco = 12.25;

        ClasseLampada lampada3 = new ClasseLampada();
        lampada3.cor = "Super Branca";
        lampada3.potencia = 25;
        lampada3.tamanho = "Grande";
        lampada3.preco = 42.25;


        System.out.println("Preço da lampada1: R$ "+lampada1.preco);
        System.out.println("Preço da lampada2: R$ "+lampada2.preco);
        System.out.println("Preço da lampada3: R$ "+lampada3.preco);

    }
}
