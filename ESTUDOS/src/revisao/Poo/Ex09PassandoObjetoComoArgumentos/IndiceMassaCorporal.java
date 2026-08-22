package revisao.Poo.Ex09PassandoObjetoComoArgumentos;

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
