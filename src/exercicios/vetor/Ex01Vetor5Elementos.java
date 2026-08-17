package exercicios.vetor;

import java.util.Arrays;

public class Ex01Vetor5Elementos {
    public static void main(String[] args) {
        //Criar vetor 5 elementos

        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = new int[5];

        for (int i = 0; i<vetorA.length; i++){
            vetorB[i] = vetorA[i];
            //System.out.println(vetorB[i]);
        }
        System.out.println("VETOR A: "+Arrays.toString(vetorA));
        System.out.println("VETOR B: "+Arrays.toString(vetorB));
    }
}
