package revisao.Poo.Ex05MetodosMenores;

public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();

        meuCarro.modelo = "X5";
        meuCarro.cor = "azul";
        meuCarro.anoFabricacao = 2025;
        meuCarro.fabricante = "BMW";
        meuCarro.precoCompra = 750000;


        seuCarro.modelo = "AIRCROSS";
        seuCarro.cor = "branco";
        seuCarro.anoFabricacao = 2016;
        seuCarro.fabricante = "CRITROEN";
        seuCarro.precoCompra = 50000;


        meuCarro.imprimirResumoDepreciacao();
        seuCarro.imprimirResumoDepreciacao();

    }
}

