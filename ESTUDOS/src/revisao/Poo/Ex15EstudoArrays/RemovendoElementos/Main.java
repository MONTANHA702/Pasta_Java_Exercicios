package revisao.Poo.Ex15EstudoArrays.RemovendoElementos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       /* int[] numerosJogoAtual = {1, 2, 3, 4, 5, 6, 7};
        int[] novoJogo = Arrays.copyOf(numerosJogoAtual, numerosJogoAtual.length);
        int[] novoJogoComCinco = Arrays.copyOf(numerosJogoAtual, 5);
        int[] novoJogoComSeis = new int[numerosJogoAtual.length - 1];

        System.out.println(Arrays.toString(numerosJogoAtual));
        System.out.println(Arrays.toString(novoJogo));
        System.out.println(Arrays.toString(novoJogoComCinco));
        System.out.println(Arrays.toString(novoJogoComSeis));*/

        //Objetivo - criar um array menor com os números do array original.

        int[] numerosJogoAtual = {1, 2, 3, 4, 5, 6, 7};//[1, 2, 3, 4, 5, 6, 7]
        int[] novoJogoComSeis = new int[numerosJogoAtual.length - 1];//[0, 0, 0, 0, 0, 0]

        //usar System.arraycopy(array de origem, posicao inicio da copia,
        // array de destino, indice de inicio, quantidade de elementos
        int indiceExclusao = 2;

        //Primeira parte [1, 2, 0, 0, 0, 0]
        System.arraycopy(numerosJogoAtual, 0,
                novoJogoComSeis, 0, indiceExclusao);
        System.out.println("Primeira parte: " + Arrays.toString(novoJogoComSeis));


        //segunda parte [0, 0, 4, 5, 6, 7]
        System.arraycopy(numerosJogoAtual, indiceExclusao + 1,
                novoJogoComSeis, indiceExclusao, novoJogoComSeis.length - indiceExclusao);
        System.out.println("Segunda parte: " + Arrays.toString(novoJogoComSeis));


        System.out.println(Arrays.toString(numerosJogoAtual));
        System.out.println(Arrays.toString(novoJogoComSeis));


    }
}
