package exercicios.poo.ex10jogodavelha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JogoMetodos jogo = new JogoMetodos();

        jogo.preencherTabuleiro();
        int contador = 0;

        while (contador < 9 && !jogo.temVencedor()) { //são 9 jogadas ao todo
            char jogador = (contador%2 == 0) ? 'X' : 'O';
            jogo.mostrarTabuleiro();
            System.out.printf("=== JOGADOR %c ===%n", jogador);

            boolean jogadaFeita = false;
            while( !jogadaFeita){
                System.out.println("Linha (1-3): ");
                int linha = sc.nextInt();
                System.out.println("Coluna (1-3): ");
                int coluna = sc.nextInt();

                if (jogo.posicaoValida(linha, coluna)) {
                    jogo.marcar(linha, coluna, jogador);
                    jogadaFeita = true;
                } else {
                    System.out.println("Jogada inválida. Tente outra.");
                }
            }
            contador++;
        }
        jogo.mostrarTabuleiro();
        if (jogo.temVencedor()) {
            System.out.println("Vencedor!");
        } else  {
            System.out.println("Deu velha!");
        }
    }
}
