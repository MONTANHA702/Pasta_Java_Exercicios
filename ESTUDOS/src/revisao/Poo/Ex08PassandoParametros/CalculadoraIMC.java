package revisao.Poo.Ex08PassandoParametros;


public class CalculadoraIMC {

    double peso;
    double altura;

    double calcular(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;

        return peso / (altura * altura);


    }
}
