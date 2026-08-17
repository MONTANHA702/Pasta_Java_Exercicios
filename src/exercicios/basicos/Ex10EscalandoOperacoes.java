package exercicios.basicos;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex10EscalandoOperacoes {
    public static void main(String[] args) {
        //Executando varias operações

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String linha = "=".repeat(60);

        System.out.println("Bem vindo à TABUADA");
        System.out.println("Digite qualquer número: ");
        double num = sc.nextDouble();
        System.out.println();
        System.out.println(linha);
        System.out.println("TABUADA DE " + num);
        System.out.println(linha);

        for (int i = 1; i < 10; i++) {
            double soma = num + i;
            double sub = num - i;
            double mult = num * i;
            double div = num / i;

            System.out.printf("%.2f + %d = %-8.2f %.2f - %d = %-8.2f %.2f X %d = %-8.2f %.2f / %d = %.2f%n", num, i, soma, num, i, sub, num, i, mult, num, i, div);

            //inserindo uma pequena pausa
            try{
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println(linha);
        sc.close();
    }
}
