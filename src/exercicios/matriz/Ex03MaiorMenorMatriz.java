package exercicios.matriz;

import java.util.Random;
import java.util.Scanner;

public class Ex03MaiorMenorMatriz {
    public static void main(String[] args) {
        //Maior e menor na matriz

        Random aleatorios = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas linhas quer na matriz? ");
        int linhas = sc.nextInt();
        System.out.println("Quantas colunas quer na matriz? ");
        int colunas = sc.nextInt();

        int max = 250;
        int min = 30;
        int soma = 0;
        String traco = "=".repeat(50);

        Integer[][] matriz = new Integer[linhas][colunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorios.nextInt(max - min + 1) + min;
                soma += matriz[i][j];
            }
        }
        int maior = 0;
        int menor = 0;
        int linMaior = -1;
        int linMenor = -1;
        int colMaior = -1;
        int colMenor = -1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 && j == 0) {
                    maior = matriz[i][j];
                    menor = matriz[i][j];
                    linMaior = i;
                    colMaior = j;
                    linMenor = i;
                    colMenor = j;

                } else {
                    if (matriz[i][j] > maior) {
                        maior = matriz[i][j];
                        linMaior = i;
                        colMaior = j;
                    }
                    if (matriz[i][j] < menor) {
                        menor = matriz[i][j];
                        linMenor = i;
                        colMenor = j;
                    }
                }
            }
        }
        double media = (double) soma/(linhas*colunas);

        System.out.printf("================= MATRIZ %d x %d =================%n", linhas, colunas);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%6d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println(traco);
        System.out.printf("Maior valor < %d > está na linha %d e coluna %d.%n", maior, linMaior, colMaior);
        System.out.printf("Menor valor < %d > está na linha %d e coluna %d.%n", menor, linMenor, colMenor);
        System.out.println("SOMA DOS ELEMENTOS:"+ soma);
        System.out.printf("MEDIA: %.2f%n", media);
        System.out.println(traco);

        sc.close();
    }
}
