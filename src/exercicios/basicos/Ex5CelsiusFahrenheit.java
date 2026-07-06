package exercicios.basicos;

import java.util.Locale;
import java.util.Scanner;

public class Ex5CelsiusFahrenheit {
    public static void main(String[] args) {
        //Conversão para grau Celsius e Fahrenheit

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite" +
                "\n1 - CELSIUS " +
                "\n2 - FAHRENHEIT ");
        int escolhaTemp = sc.nextInt();

        String linha = "=".repeat(25);

        while ((escolhaTemp != 1) && (escolhaTemp != 2)){
            System.out.println("Entrada inválida. Digite somente 1 para Celsius ou 2 para Fahrenheit.");
            escolhaTemp = sc.nextInt();
        }
        if (escolhaTemp == 1){
            System.out.println("Digite a temperatura em GRAUS CELSIUS:  ");
            double celsius = sc.nextDouble();
            double fahrenheit = (9*celsius/5) + 32;
            System.out.println(linha);
            System.out.printf("%.2f CELSIUS equivale a %.2f GRAUS FAHRENHEIT.\n", celsius, fahrenheit);
            System.out.println(linha);
        } else {
            System.out.println("Digite a temperatura em GRAUS FAHRENHEIT: ");
            double fahrenheit = sc.nextDouble();
            double celsius = (5*(fahrenheit -32)/9);
            System.out.println(linha);
            System.out.printf("%.2f FAHRENHEIT equivale a %.2f GRAUS CELSIUS.\n", fahrenheit, celsius);
            System.out.println(linha);
        }
        sc.close();

    }
}
