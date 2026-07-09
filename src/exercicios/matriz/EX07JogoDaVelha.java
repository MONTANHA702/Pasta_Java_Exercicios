package exercicios.matriz;

import java.util.Scanner;

public class EX07JogoDaVelha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //criar tabuleiro 3x3
        char[][] tabuleiro = new char[3][3];

        //preencher tabuleiro com "-"
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = '-';
            }
        }

        //imprimir
        System.out.println("===== JOGO DA VELHA =====");

        //bloco para primeira apresentação, mas ficou redundante.
        /*for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.printf("%3c", tabuleiro[i][j]);
            }
            System.out.println();

        }*/

        String sep = "=".repeat(25);
        System.out.println(sep);
        System.out.println("Vamos jogar!!!!!");
        System.out.println(sep);

        //jogada
        int contador = 0;
        boolean temVencedor = false;

        while (contador < 9 && !temVencedor) { //sao 9 jogadas no jogo da velha
            char jogador = (contador % 2 == 0) ? 'X' : 'O';
            System.out.printf("== JOGADOR %c ==%n", jogador);

            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    System.out.printf("%3c", tabuleiro[i][j]);
                }
                System.out.println();
            }
            //validar
            boolean jogadaValida = false;
            while (!jogadaValida) {
                System.out.println("Qual linha deseja jogar (jogue de 1 a 3): ");
                int linha = sc.nextInt();
                System.out.println("Qual coluna deseja jogar (jogue de 1 a 3): ");
                int coluna = sc.nextInt();
                //linha >=1 && linha <=3
                if ((!(linha < 1) && !(linha > 3)) && ((!(coluna < 1) && !(coluna > 3)) && (tabuleiro[linha - 1][coluna - 1] == '-'))) {
                    tabuleiro[linha - 1][coluna - 1] = jogador;
                    //Verificando linha
                    for (int i = 0; i < 3; i++) {
                        if (tabuleiro[i][0] != '-' && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                            System.out.printf("Jogador %c venceu!%n", jogador);
                            temVencedor = true;
                        }
                    }
                    //Verificando coluna
                    for (int j = 0; j < 3; j++) {
                        if (tabuleiro[0][j] != '-' && tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[1][j] == tabuleiro[2][j]) {
                            System.out.printf("Jogador %c venceu!%n", jogador);
                            temVencedor = true;
                        }
                    }
                    if (tabuleiro[0][0] != '-' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
                        System.out.printf("Jogador %c venceu!%n", jogador);
                        temVencedor = true;
                    }
                    if (tabuleiro[2][0] != '-' && tabuleiro[2][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[0][2]) {
                        System.out.printf("Jogador %c venceu!%n", jogador);
                        temVencedor = true;
                    }
                    jogadaValida = true;
                } else {
                    System.out.println("Jogada Inválida! Tente outra posição.");
                }
            }
            contador++;
        }
        System.out.println("=== RESULTADO FINAL ===");
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.printf("%3c", tabuleiro[i][j]);
            }
            System.out.println();
        }

        if (!temVencedor) {
            System.out.println("Deu velha!");
        }
        sc.close();
    }
}


