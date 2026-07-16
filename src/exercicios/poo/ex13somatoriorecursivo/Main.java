package exercicios.poo.ex13somatoriorecursivo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        System.out.printf("Soma dos números até %d vale %d", n, Somatorio.soma(n));


        sc.close();
    }
}
