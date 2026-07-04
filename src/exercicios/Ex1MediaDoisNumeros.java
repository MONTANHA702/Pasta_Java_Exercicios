package java.basico;

import java.util.Locale;
import java.util.Scanner;

public class Ex1MediaDoisNumeros {
    public static void main(String[] args) {
        //Media de 2 numeros

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2)/2;

        System.out.printf("A média entre %.2f e %.2f vale %.2f ", n1, n2, media);

        sc.close();

    }
}
