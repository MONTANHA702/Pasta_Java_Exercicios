package revisao.Poo.ClasseCarro;



public class MainCarro {
    public static void main(String[] args) {
        //instanciar uma classe
        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();
        Pessoa eu = new Pessoa();
        eu.nome = "Jader";
        eu.anoDeNascimento = 2000;
        eu.cpf = "111.222.333-99";

        Pessoa voce = new Pessoa();
        voce.nome = "Joaozinho";

        //inserindo atributos
        meuCarro.modelo = "X5";
        meuCarro.cor = "azul";
        meuCarro.anoFabricacao = 2026;
        meuCarro.fabricante = "BMW";
        //meuCarro.proprietario = new Pessoa(); //instanciando o atributo proprietário que é uma classe
        //meuCarro.proprietario.nome = "Jader";

        //como pessoa já foi instanciado
        meuCarro.proprietario = eu;



        seuCarro.modelo = "AIRCROSS";
        seuCarro.cor = "branco";
        seuCarro.anoFabricacao = 2016;
        seuCarro.fabricante = "CRITROEN";
        seuCarro.proprietario = voce;

        System.out.println("Meu carro é um " + meuCarro.modelo);
        System.out.println("Meu nome é:" + meuCarro.proprietario.nome);
        System.out.println("======");
        System.out.println("Seu carro é um " + seuCarro.modelo);
        System.out.println("Seu nome é:" + seuCarro.proprietario.nome);
    }
}
