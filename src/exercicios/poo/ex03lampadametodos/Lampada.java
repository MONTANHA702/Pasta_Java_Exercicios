package exercicios.poo.ex03lampadametodos;

public class Lampada {

    String marca;
    String modelo;
    String cor;
    int walts;
    double preco;

    void fichaTecnica(){
        System.out.println("=== Ficha Tecnica ===");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Cor: "+cor);
        System.out.println("Potencia: "+walts);
        System.out.println("Preco: "+preco);
        System.out.println("================");
    }

    void ligar(){
        System.out.println("A lâmpada está ligada");
    }
    void desligar(){
        System.out.println("A lâmpada está desligada");
    }

}
