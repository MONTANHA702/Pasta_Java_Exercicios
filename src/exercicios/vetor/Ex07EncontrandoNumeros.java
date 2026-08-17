package exercicios.vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07EncontrandoNumeros {
    public static void main(String[] args) {
        //Encontrar número num vetor

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] vetA = new int[tamanho];
        for (int i = 0; i < vetA.length; i++) {
            System.out.printf("Digite o valor da %da. posição: %n", i + 1);
            vetA[i] = sc.nextInt();
        }
        System.out.println("VETOR A: " + Arrays.toString(vetA));

        System.out.println("Qual número deseja procurar? ");
        int numero = sc.nextInt();
        int indice = -1; //indexOf nunca é encontrado

        for (int i = 0; i < tamanho; i++) {
            if (vetA[i] == numero){
                indice = i;
                break; //encerra o loop assim que encontra.

            }
        }
        if (indice != -1){
            System.out.printf("Número %d foi encontrado na posição %d%n", numero, indice);
        } else {
            System.out.printf("Número %d não encontrado no vetor.%n", numero);
        }



        sc.close();
    }
}
