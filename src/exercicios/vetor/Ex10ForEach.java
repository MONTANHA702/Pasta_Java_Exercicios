package exercicios.vetor;

import java.util.Scanner;

public class Ex10ForEach {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos nomes terá a lista? ");
        int quantNomes = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[quantNomes];
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o %do. nome: %n", i + 1);
            nomes[i] = sc.nextLine().trim().toUpperCase();
        }

        //For Each
        System.out.println("== LISTA DE NOMES ==");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        sc.close();


    }
}
