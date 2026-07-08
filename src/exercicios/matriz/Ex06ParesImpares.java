package exercicios.matriz;

import java.util.Random;
import java.util.Scanner;

public class Ex06ParesImpares {
    public static void main(String[] args) {
        //Pares e impares

        Random numAleatorios = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quatidade de linhas: ");
        int linhas = sc.nextInt();
        System.out.println("Digite a quantidade de colunas: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];
        String sep = "=".repeat(35);

        System.out.println(sep);
        System.out.println("Matriz [ " + linhas + "x" + colunas + " ]");
        System.out.println(sep);

        int contPar = 0;
        int somaPar = 0;
        int contImpar = 0;
        int somaImpar = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = numAleatorios.nextInt(100) + 1;
                System.out.printf("%6d", matriz[i][j]);
                if (matriz[i][j]%2 == 0){
                    contPar++;
                    somaPar += matriz[i][j];
                } else {
                    contImpar++;
                    somaImpar += matriz[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(sep);
        System.out.println("Número total de elementos: " + (linhas*colunas));
        System.out.printf("QUANTIDADE DE PARES: <%d> SOMA DOS PARES <%d>%n", contPar, somaPar);
        System.out.printf("QUANTIDADE DE ÍMPARES: <%d> SOMA DOS ÍMPARES <%d>%n", contImpar, somaImpar);

        //operador ternario < variavel = (condicao) ? verdadeiro : falso; >

        double mediaPar = (contPar > 0) ? (double) somaPar/contPar : 0;
        double mediaImpar = (contImpar > 0) ? (double) somaImpar/contImpar : 0;


        System.out.printf("MÉDIA DOS PARES: %.2f%n", mediaPar);
        System.out.printf("MÉDIA DOS ÍMPARES: %.2f%n", mediaImpar);
        System.out.println(sep);

        sc.close();
    }
}
