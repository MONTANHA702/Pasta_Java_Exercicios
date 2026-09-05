package revisao.Poo.DesafioVarargs;

import java.util.Arrays;

public class MediaNumerosVarargs {

    double calcularMedia(double numero1, double numero2, double... numeros){

        //construir um vetor com os argumentos
        double[] todosOsNumeros = Arrays.copyOf(numeros, numeros.length + 2);
        todosOsNumeros[todosOsNumeros.length - 2] = numero1;
        todosOsNumeros[todosOsNumeros.length - 1] = numero2;

        int total = todosOsNumeros.length;
        //double soma = Arrays.stream(todosOsNumeros).sum();

        double soma = 0;
        for (double numero : todosOsNumeros) {
            soma += numero;
        }

        return  soma / total;



    }
}
