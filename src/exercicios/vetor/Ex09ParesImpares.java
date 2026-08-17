package exercicios.vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09ParesImpares {
    public static void main(String[] args) {

        //Pares e impares

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        int[] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %do. elemento: %n", i + 1);
            vetor[i] = sc.nextInt();
        }

        int par = 0;
        int somaPar = 0;
        int impar = 0;
        int somaImpar = 0;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i]%2 == 0){
                par++;
                somaPar += vetor[i];
            } else {
                impar++;
                somaImpar += vetor[i];
            }
        }
        System.out.println("VETOR: " + Arrays.toString(vetor));
        System.out.println("PARES: "+ par);
        System.out.println("IMPARES: "+ impar);
        System.out.println("SOMA DOS PARES: "+ somaPar);
        System.out.println("SOMA DOS ÍMPARES: "+ somaImpar);



        sc.close();
    }
}
