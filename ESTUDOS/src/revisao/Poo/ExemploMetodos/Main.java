package revisao.Poo.ExemploMetodos;


public class Main {
    public static void main(String[] args) {

       Carro meuCarro = new Carro();
       Carro seuCarro = new Carro();

        meuCarro.modelo = "X5";
        meuCarro.cor = "azul";
        meuCarro.anoFabricacao = 2026;
        meuCarro.fabricante = "BMW";



        seuCarro.modelo = "AIRCROSS";
        seuCarro.cor = "branco";
        seuCarro.anoFabricacao = 2016;
        seuCarro.fabricante = "CRITROEN";

        meuCarro.calcularValorRevenda();
        seuCarro.calcularValorRevenda();



    }

}
