package exercicios.matriz;

import java.util.Random;
import java.util.Scanner;

public class Ex04MaiorMenorValorLinhaSoma {
    public static void main(String[] args) {

        Random numerosAleatorios = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a quantidade de linhas: ");
        int linhas = sc.nextInt();
        System.out.println("Entre com a quantidade de colunas: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = numerosAleatorios.nextInt(100);
            }
        }
        System.out.printf("======== IMPRIMINDO MATRIZ %d x %d ========%n",linhas, colunas);
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("%6d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.print("Escolha uma linha da matriz: ");
        int linhaEscolhida = sc.nextInt();
        while (linhaEscolhida < 0 || linhaEscolhida > linhas-1){
            System.out.println("Linha não encontrada na matriz." +
                    "\nDigite uma linha de 0 e "+ (linhas-1));
            linhaEscolhida = sc.nextInt();
        }

        System.out.printf("%n=======IMPRIMINDO LINHA %d.=======%n", linhaEscolhida);
        for (int j = 0; j < matriz[linhaEscolhida].length; j++){
                System.out.printf("%6d", matriz[linhaEscolhida][j]);
            }

        int soma = 0;
        int maior = -1;
        int menor = -1;

        for (int j = 0; j < matriz[linhaEscolhida].length; j++){
            soma += matriz[linhaEscolhida][j];
            if (j == 0){
                maior = matriz[linhaEscolhida][j];
                menor = matriz[linhaEscolhida][j];
            } else {
                if (matriz[linhaEscolhida][j] > maior){
                   maior = matriz[linhaEscolhida][j];
                }
                if (matriz[linhaEscolhida][j] < menor){
                    menor = matriz[linhaEscolhida][j];
                }
            }

        }
        String traco = "=".repeat(35);
        System.out.println();
        System.out.println(traco);
        System.out.printf("%nMAIOR VALOR LINHA %d: %d.%n", linhaEscolhida, maior);
        System.out.printf("MENOR VALOR LINHA %d: %d.%n", linhaEscolhida, menor);
        System.out.printf("SOMA VALORES LINHA %d: %d.%n", linhaEscolhida, soma);
        System.out.println(traco);


        sc.close();
    }
}
