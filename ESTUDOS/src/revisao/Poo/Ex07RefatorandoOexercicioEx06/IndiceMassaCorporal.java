package revisao.Poo.Ex07RefatorandoOexercicioEx06;

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
