package exercicios.vetor;

import java.util.Arrays;

public class Ex02CopiandoVetorClone {
    public static void main(String[] args) {
        //Usando .clone()

        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = vetorA.clone();

        System.out.println("VETOR A:"+ Arrays.toString(vetorA));
        System.out.println("VETOR B:"+ Arrays.toString(vetorB));
        System.out.println("===========================");

        vetorB[0] = 17;

        System.out.println("VETOR A:"+ Arrays.toString(vetorA));
        System.out.println("VETOR B:"+ Arrays.toString(vetorB));


    }
}
