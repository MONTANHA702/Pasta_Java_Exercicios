package revisao.Poo.Ex02ExemploMetodos;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    Pessoa proprietario;

    //Metodo
    void calcularValorRevenda() {
        System.out.printf("Calcular valor de revenda do %S ano %d%n", modelo, anoFabricacao);
    }
}

