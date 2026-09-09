package revisao.poo.ex09passandoobjetocomoargumentos;

public class IndiceMassaCorporal {

    double resultado;
    double peso;
    double altura;

    boolean estaComObesidade() {
        return resultado >= 30;
    }

    boolean estaAbaixoDoPeso() {
        return resultado <= 18.5;
    }
}
