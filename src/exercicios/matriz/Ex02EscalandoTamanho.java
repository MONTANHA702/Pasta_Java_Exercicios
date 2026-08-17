package exercicios.matriz;

import java.util.Random;
import java.util.Scanner;

public class Ex02EscalandoTamanho {
    public static void main(String[] args) {
        //Escalando o tamanho da matriz


        Scanner sc = new Scanner(System.in);
        Random numerosaleatorios = new Random();

        System.out.println("Quantas linhas terá a matriz? ");
        int linhas = sc.nextInt();
        System.out.println("Quantas colunas terá a matriz? ");
        int colunas = sc.nextInt();

        int[][] matrizAleatoria = new int[linhas][colunas];

        for (int i = 0; i < matrizAleatoria.length; i++){
            for(int j = 0; j < matrizAleatoria[i].length; j++){
               matrizAleatoria[i][j] = numerosaleatorios.nextInt(100);
            }
        }
        System.out.printf("========== MATRIZ %d x %d ==========%n", linhas, colunas);
        for (int i = 0; i < matrizAleatoria.length; i++){
            for(int j = 0; j < matrizAleatoria[i].length; j++){
                System.out.printf("%6d", matrizAleatoria[i][j]);
            }
            System.out.println();
        }

        //System.out.printf("========== MATRIZ %d x %d ==========%n", linhas, colunas);
        //System.out.println(Arrays.deepToString(matrizAleatoria));

        sc.close();

    }
}
