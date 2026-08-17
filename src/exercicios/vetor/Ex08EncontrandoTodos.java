package exercicios.vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Ex08EncontrandoTodos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        int[] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %do. elemento: %n", i + 1);
            vetor[i] = sc.nextInt();
        }
        System.out.println("VETOR: " + Arrays.toString(vetor));

        boolean achou = false;
        System.out.println("Qual número deseja procurar? ");
        int numero = sc.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.printf("Número %d achado na posição %d.%n", numero, i);
                achou = true;
            }
        }

        if (!achou) { //fora do loop
            System.out.println("Numero não encontrado.");
        }

        sc.close();
    }
}
