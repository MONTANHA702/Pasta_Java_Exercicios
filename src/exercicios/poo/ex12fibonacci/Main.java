package exercicios.poo.ex12fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o n da sequencia fibonacci: ");
        int n = sc.nextInt();

        System.out.printf("== %d números da sequência fibonacci ==%n", n);
        for (int i = 0; i < n; i++) {
            System.out.print(MetodoFibonacciRecursivo.fibonacci(i) + " ");

        }


    }
}
