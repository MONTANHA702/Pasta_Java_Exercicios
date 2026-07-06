package exercicios.basicos;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex04AumentandoPossibilidadeMediasArray {
    public static void main(String[] args) {
        //Escalando a quantidade de notas

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Quantas notas serão lançadas? ");
        int quantNotas = sc.nextInt();

        double[] notas = new double[quantNotas];
        for (int i = 0; i < notas.length; i++){
            System.out.printf("Digite a %da nota: ", i+1);
            notas[i] = sc.nextDouble();
        }

        double media = Arrays.stream(notas).average().orElse(0);
        String linha = "=".repeat(20);
        System.out.println();
        System.out.println(linha);
        System.out.println("NOTAS: " + Arrays.toString(notas));
        System.out.printf("MEDIA: %.3f\n", media);
        System.out.println(linha);

    }
}
