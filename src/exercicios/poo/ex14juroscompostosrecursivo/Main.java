package exercicios.poo.ex14juroscompostosrecursivo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o capital inicial: ");
        double capital = sc.nextDouble();
        System.out.println("Digite a taxa ao mês: ");
        double taxa = sc.nextDouble()/100;
        System.out.println("Digite o período em meses: ");
        int periodo = sc.nextInt();

        double capitalFinal = JurosCompostos.montante(capital, taxa, periodo);
        System.out.printf("O montante ao final de %d meses será R$ %.2f ", periodo, capitalFinal);


        sc.close();
    }
}
