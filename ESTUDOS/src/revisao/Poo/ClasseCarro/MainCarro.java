package revisao.Poo.ClasseCarro;



public class MainCarro {
    public static void main(String[] args) {
        //instanciar uma classe
        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();


        //inserindo atributos
        meuCarro.modelo = "X5";
        meuCarro.cor = "azul";
        meuCarro.anoFabricacao = 2026;
        meuCarro.fabricante = "BMW";

        seuCarro.modelo = "AIRCROSS";
        seuCarro.cor = "branco";
        seuCarro.anoFabricacao = 2016;
        seuCarro.fabricante = "CRITROEN";

        System.out.println("Meu carro é um " + meuCarro.modelo);
        System.out.println("Seu carro é um " + seuCarro.modelo);

    }
}
