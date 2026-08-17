package exercicios.basicos;

import java.util.Scanner;

public class Ex07ContandoVogaisEConsoantes {
    public static void main(String[] args) {

        //Contando vogais e consoantes
        Scanner sc = new Scanner(System.in);

        int vogal = 0;
        int consoante = 0;
        int outrosCaracteres = 0;
        System.out.println("Digite uma palavra qualquer:");
        String palavra = sc.nextLine().trim().toUpperCase();
        while (palavra.isEmpty()){
            System.out.println("Entrada inválida. Digite uma palavra: ");
            palavra = sc.nextLine().trim().toUpperCase();
        }
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if ("AEIOU".indexOf(letra) != -1) {
                vogal++;
            } else if (Character.isLetter(letra)) {
                consoante++;
            } else {
                outrosCaracteres++;
            }
        }
        System.out.println("==Contador de vogais e consoantes==");
        System.out.println(palavra);
        System.out.println("VOGAIS: "+ vogal);
        System.out.println("CONSOANTES: " + consoante);
        System.out.println("OUTROS CARACTERES: "+ outrosCaracteres);

        sc.close();


    }
}
