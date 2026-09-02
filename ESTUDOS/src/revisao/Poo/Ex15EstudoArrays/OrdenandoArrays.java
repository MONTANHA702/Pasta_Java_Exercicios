package revisao.Poo.Ex15EstudoArrays;

import java.util.Arrays;
import java.util.Comparator;

public class OrdenandoArrays {
    public static void main(String[] args) {

        int[] numeros = {6, 2, 7, 4, 5};

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        //colocando na ordem inversa
        Integer[] numerosInvertidos = {1, 2, 3, 4, 5};//observe que tem que ser wrapper
        Arrays.sort(numerosInvertidos, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numerosInvertidos));


    }
}
