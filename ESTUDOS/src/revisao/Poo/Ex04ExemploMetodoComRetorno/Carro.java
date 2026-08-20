package revisao.Poo.Ex04ExemploMetodoComRetorno;


public class Carro {
    String fabricante;
    String modelo;
    String cor;
    double precoCompra;
    int anoFabricacao;


    //Metodo
    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = 2026 - anoFabricacao;
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;

    }

}
