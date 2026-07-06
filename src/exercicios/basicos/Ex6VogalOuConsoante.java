package exercicios.basicos;

import java.util.Scanner;

public class Ex6VogalOuConsoante {
    public static void main(String[] args) {

        //Vogal ou Consoante

        Scanner sc = new Scanner(System.in);

        System.out.println("===CLASSIFICADOR DE LETRA===");
        System.out.println("Digite uma letra qualquer: ");
        String letra = sc.nextLine().trim().toUpperCase();
        while (letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
            System.out.println("Entrada inválida. Digite apenas uma letra: ");
            letra = sc.nextLine().trim().toUpperCase();
        }
        if ("AEIOU".contains(letra)){
            System.out.printf("A letra %s é vogal.%n", letra);
        } else {
            System.out.printf("A letra %s é consoante.%n", letra);
        }
        sc.close();

    }
}
