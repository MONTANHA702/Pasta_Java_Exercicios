package exercicios.poo.ex10jogodavelha;

import java.util.Scanner;

public class JogoMetodos {

    private char[][] tabuleiro = new char[3][3];

    public void preencherTabuleiro() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = '-';
            }
        }
    }

    public void mostrarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3c", tabuleiro[i][j]);
            }
            System.out.println();
        }
    }

    public boolean posicaoValida(int linha, int coluna) {
        if (linha < 1 || linha > 3 || coluna < 1 || coluna > 3) {
            return false;
        } else {
            return tabuleiro[linha - 1][coluna - 1] == '-';
        }
    }

    public void marcar(int linha, int coluna, char jogador) {
        tabuleiro[linha - 1][coluna - 1] = jogador;
    }

    public boolean temVencedor() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] != '-' && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                return true;
            }
        }
        //Verificando coluna
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] != '-' && tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[1][j] == tabuleiro[2][j]) {
                return true;
            }
        }
        if (tabuleiro[0][0] != '-' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            return true;
        }
        if (tabuleiro[2][0] != '-' && tabuleiro[2][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[0][2]) {
            return true;
        }
        return false;
    }



}
