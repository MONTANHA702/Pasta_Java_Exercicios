package revisao.Poo.Ex03ImplementandoLogicaMetodo;


public class Carro {
    String fabricante;
    String modelo;
    String cor;
    double precoCompra;
    int anoFabricacao;
    Pessoa proprietario;

    //Metodo
    void calcularValorRevenda() {
        int tempoDeUsoEmAnos = 2026 - anoFabricacao;
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }
        System.out.println("======");
        System.out.println("Tempo de uso: " + tempoDeUsoEmAnos);
        System.out.printf("O valor da revenda do veículo %S ano %d vale R$ %.2f%n",
                modelo,
                anoFabricacao,
                valorRevenda);
    }

}
