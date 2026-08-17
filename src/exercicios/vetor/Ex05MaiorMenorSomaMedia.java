package exercicios.vetor;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex05MaiorMenorSomaMedia {
    public static void main(String[] args) {
        //Maior, menor, soma, media

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        double[] vetorA = new double[tamanho];

        double soma = 0;
        double maior = 0;
        double menor = 0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Digite o %do. elemento do vetor: %n", i + 1);
            vetorA[i] = sc.nextDouble();
            soma += vetorA[i];

            if (i == 0){
                maior = vetorA[i];
                menor = vetorA[i];
            } else {
                if (vetorA[i] > maior) {
                    maior = vetorA[i];
                }
                if(vetorA[i] < menor) {
                    menor = vetorA[i];
                }
            }
        }
        double media = soma/tamanho;

        System.out.println("VETOR A: "+Arrays.toString(vetorA));
        System.out.println("MAIOR: "+ maior);
        System.out.println("MENOR: "+ menor);
        System.out.printf("MÉDIA: %.2f%n",media );




      /*
        System.out.println("VETOR A: "+ Arrays.toString(vetorA));
        System.out.println("MAIOR VALOR DE VETOR A: "+ Arrays.stream(vetorA).max().getAsDouble());
        System.out.println("MENOR VALOR DE VETOR A: "+ Arrays.stream(vetorA).min().getAsDouble());
        System.out.println("MEDIA VALORES DO VETOR A: "+ Arrays.stream(vetorA).average().getAsDouble());
*/

        sc.close();
    }
}
