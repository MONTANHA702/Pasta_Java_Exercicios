package revisao.Poo.Ex04ExemploMetodoComRetorno;

public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();

        meuCarro.modelo = "X5";
        meuCarro.cor = "azul";
        meuCarro.anoFabricacao = 2026;
        meuCarro.fabricante = "BMW";
        meuCarro.precoCompra = 750000;


        seuCarro.modelo = "AIRCROSS";
        seuCarro.cor = "branco";
        seuCarro.anoFabricacao = 2016;
        seuCarro.fabricante = "CRITROEN";
        seuCarro.precoCompra = 50000;

        System.out.printf("Tempo de uso (anos): %d%n", 2026 - meuCarro.anoFabricacao);
        System.out.printf("O valor de revenda do carro %S ano %d é R$ %.2f%n",
                meuCarro.modelo,
                meuCarro.anoFabricacao,
                meuCarro.calcularValorRevenda());

        System.out.printf("Tempo de uso (anos): %d%n", 2026 - seuCarro.anoFabricacao);
        System.out.printf("O valor de revenda do carro %S ano %d é R$ %.2f%n",
                seuCarro.modelo,
                seuCarro.anoFabricacao,
                seuCarro.calcularValorRevenda());

    }
}
