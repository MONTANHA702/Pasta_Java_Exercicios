package exercicios.basicos;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex03MediaQuatroValoresArray {
    public static void main(String[] args) {
        //Usando Array

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double[] notas = new double[4];

        for (int i = 0; i < notas.length; i++ ){
            System.out.printf("\nDigite a %da nota: ", i+1);
            notas[i] = sc.nextDouble();
        }
        double media = Arrays.stream(notas).average().orElse(0);
        String linha = "-".repeat(15);

        System.out.println();
        System.out.println(linha);
        System.out.println("Notas: "+ Arrays.toString(notas));
        System.out.printf("Media: %.3f\n", media);
        System.out.println(linha);

    }
}
