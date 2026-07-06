package exercicios.vetor;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex06InvertendoVetor {
    public static void main(String[] args) {
        //Invertendo as posições

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int tamanho = sc.nextInt();
        double[] vetor = new double[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %do. elemento: %n", i + 1);
            vetor[i] = sc.nextDouble();
        }
        System.out.println("VETOR: " + Arrays.toString(vetor));

        //Invertendo
        /*int j = 0;
        double[] vetorB = new double[tamanho];
        for (int i = tamanho - 1; i >= 0; i--) {
            vetorB[j] = vetor[i];
            j++;
        }
*/
        //Outra forma
        double[] vetorB = new double[tamanho];
        for(int i = 0; i<vetor.length; i++){
            vetorB[i] = vetor[tamanho -1 -i];
        }




        System.out.println("VETOR B: " + Arrays.toString(vetorB));



        //Para usar Collections.reverse nao pode ser tipo primitivo.
      /*  Integer[] vetorC = {1, 2, 3, 4, 5};
        Collections.reverse(Arrays.asList(vetorC));
        System.out.println("VETOR C INVERTIDO: " + Arrays.toString(vetorC));
*/
        sc.close();
    }
}
