package exercicios.vetor;

import java.util.Arrays;

public class Ex03CriandoVetorDobro {
    public static void main(String[] args) {

        int[] vetorA = new int[8];
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = i +1;
            //System.out.println(vetorA[i]);
        }
        int[] vetorB = new int[8];
        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = vetorA[i]*2;
        }

        System.out.println("VETOR A: "+ Arrays.toString(vetorA));
        System.out.println("VETOR B: "+ Arrays.toString(vetorB));



    }
}
