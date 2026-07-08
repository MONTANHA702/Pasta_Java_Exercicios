package exercicios.matriz;

import java.util.Random;
import java.util.Scanner;

public class Ex05BuscaLinhaColuna {
    public static void main(String[] args) {
        //Busca por linha ou coluna

        Random numAleatorios = new Random(42); //rastreando o resultado
        Scanner sc = new Scanner(System.in);

        String separador = "=".repeat(40);
        System.out.println("Quantas linhas terá a matriz? ");
        int linhas = sc.nextInt();
        System.out.println("Quantas colunas terá a matriz? ");
        int colunas = sc.nextInt();
        sc.nextLine();

        int[][] matriz = new int[linhas][colunas];
        int min = 500;
        int max = 750;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numAleatorios.nextInt(max - min + 1) + min;
            }
        }
        System.out.printf("========== IMPRIMINDO MATRIX %d x %d ==========%n", linhas, colunas);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%6d", matriz[i][j]);
            }
            System.out.println();
        }
        //Escolhendo linha ou coluna

        System.out.println("ESCOLHA: " +
                "\n1 - LINHA" +
                "\n2 - COLUNA");
        String escolha = sc.nextLine().trim();
        while (!(escolha.equals("1")) && !(escolha.equals("2"))) {
            System.out.println("Escolha <1> para LINHA ou <2> para coluna");
            escolha = sc.nextLine();
        }
        switch (escolha) {
            case "1":
                System.out.println("Qual linha deseja pesquisar? ");
                int linhaEscolhida;
                while (true) {
                    String entrada = sc.nextLine().trim();
                    try {
                        linhaEscolhida = Integer.parseInt(entrada);
                        if (linhaEscolhida >= 0 && linhaEscolhida < linhas) break;
                        System.out.println("Fora do intervalo. Digite de 0 a " + (linhas -1));
                    } catch (NumberFormatException e) {
                        System.out.println("Digite um número  válido.");
                    }
                }

                System.out.printf("========LINHA ESCOLHIDA: %d ========%n", linhaEscolhida);
                for (int j = 0; j < matriz[linhaEscolhida].length; j++) {
                    System.out.printf("%6d", matriz[linhaEscolhida][j]);
                }

                int soma = 0;
                int maior = -1;
                int menor = -1;

                for (int j = 0; j < matriz[linhaEscolhida].length; j++) {
                    soma += matriz[linhaEscolhida][j];
                    if (j == 0) {
                        maior = matriz[linhaEscolhida][j];
                        menor = matriz[linhaEscolhida][j];
                    } else {
                        if (matriz[linhaEscolhida][j] > maior) {
                            maior = matriz[linhaEscolhida][j];
                        }
                        if (matriz[linhaEscolhida][j] < menor) {
                            menor = matriz[linhaEscolhida][j];
                        }
                    }
                }
                System.out.println();
                System.out.println(separador);
                System.out.println("MAIOR: " + maior);
                System.out.println("MENOR: " + menor);
                System.out.println("SOMA: " + soma);
                System.out.println(separador);
                break;
            case "2":
                System.out.println("Qual coluna deseja pesquisar? ");
                int colunaEscolhida;
                while (true) {
                    String entrada = sc.nextLine().trim();
                    try {
                        colunaEscolhida = Integer.parseInt(entrada);
                        if (colunaEscolhida >= 0 && colunaEscolhida < colunas) break;
                        System.out.println("Fora do intervalo. Digite de 0 a " + (colunas -1));
                    } catch (NumberFormatException e) {
                        System.out.println("Digite um número  válido.");
                    }
                }
                System.out.printf("========COLUNA ESCOLHIDA: %d ========%n", colunaEscolhida);
                for (int i = 0; i < matriz.length; i++) {
                    System.out.println(matriz[i][colunaEscolhida]);
                }
                int somaColuna = 0;
                int maiorColuna = -1;
                int menorColuna = -1;
                for (int i = 0; i < matriz.length; i++) {
                    somaColuna += matriz[i][colunaEscolhida];
                    if (i == 0) {
                        maiorColuna = matriz[i][colunaEscolhida];
                        menorColuna = matriz[i][colunaEscolhida];
                    } else {
                        if (matriz[i][colunaEscolhida] > maiorColuna) {
                            maiorColuna = matriz[i][colunaEscolhida];
                        }
                        if (matriz[i][colunaEscolhida] < menorColuna) {
                            menorColuna = matriz[i][colunaEscolhida];
                        }
                    }
                }
                System.out.println();
                System.out.println(separador);
                System.out.println("MAIOR: " + maiorColuna);
                System.out.println("MENOR: " + menorColuna);
                System.out.println("SOMA: " + somaColuna);
                System.out.println(separador);
                break;
            default:
                System.out.println();
        }
        sc.close();
    }
}
