package revisao.Poo.Ex15EstudoArrays.CopiandoExpandindo;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        int[] numerosJogo1 = {3, 12, 45, 59, 33, 4};

        //Arrays.copyOf cria uma cópia - objeto, tamanho objeto
        //permite pegar partes do objeto original, basta colocar no tamanho

        int[] numerosJogo2 = Arrays.copyOf(numerosJogo1, numerosJogo1.length);

        System.out.println(Arrays.toString(numerosJogo1));
        System.out.println(Arrays.toString(numerosJogo2));

        //expandindo
        int[] numerosJogo3 = Arrays.copyOf(numerosJogo1, numerosJogo1.length + 1);
        System.out.println(Arrays.toString(numerosJogo3));
        //inserir
        numerosJogo3[numerosJogo3.length -1] = 16;
        System.out.println(Arrays.toString(numerosJogo3));

    }
}
