package exercicios.vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04EscalandoTamanho {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = sc. nextInt();
        int[] vetorA = new int[tamanho];
        int[] vetorC = new  int[tamanho];
        int[] vetorD = new  int[tamanho];
        double[] vetorE = new  double[tamanho];
        double[] vetorF = new  double[tamanho];



        for (int i =0; i < vetorA.length; i++){
            vetorA[i] = i + 1;
            vetorC[i] = vetorA[i]*2;
            vetorD[i] = vetorC[i]*vetorC[i];
            vetorE[i] = Math.sqrt(vetorD[i]);
            vetorF[i] = Math.pow(vetorC[i], 3);


        }
        int[] vetorB = vetorA.clone();

        System.out.println("Vetor A: "+ Arrays.toString(vetorA));
        System.out.println("Vetor B: "+ Arrays.toString(vetorB));
        System.out.println("Vetor C: "+ Arrays.toString(vetorC));
        System.out.println("Vetor D: "+ Arrays.toString(vetorD));
        System.out.println("Vetor E: "+ Arrays.toString(vetorE));
        System.out.println("Vetor F: "+ Arrays.toString(vetorF));

        sc.close();

    }
}
