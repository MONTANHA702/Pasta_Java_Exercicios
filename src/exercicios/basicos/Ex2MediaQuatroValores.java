package exercicios.basicos;

import java.util.Locale;
import java.util.Scanner;

public class Ex2MediaQuatroValores {
    public static void main(String[] args) {
        //Media 4 valores entrada simples

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double n3 = sc.nextDouble();
        System.out.println("Digite o quarto número: ");
        double n4 = sc.nextDouble();

        double media = (n1 + n2 + n3 + n4)/4;

        System.out.printf("A média dos números (%.2f, %.2f, %.2f e %.2f) vale %.2f", n1, n2, n3, n4, media);

        sc.close();

    }
}
