package revisao.Poo.Ex15EstudoArrays;

public class Calculadora {

    static double calcularMedia(int[] numeros) {
        int total = 0;
        int tamanhoArray = numeros.length;


        //for(int i = 0; i < numeros.length; i++)
        for (int numero : numeros) {
            total += numero;
        }
        return (double) total / tamanhoArray;

    }
}
