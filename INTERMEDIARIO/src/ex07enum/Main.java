package ex07enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== Dias da Semana ==");
        DiaDaSemana[] dias = DiaDaSemana.values();
        for (int i = 0; i < dias.length; i++) {
            System.out.println((i + 1) + " - " + dias[i]);
        }


        System.out.println("Digite um dia da semana: ");
        String dia = sc.nextLine().trim().toUpperCase();
        try {
            DiaDaSemana d = DiaDaSemana.valueOf(dia);
            System.out.print(d + " - ");
            verOdia(d);
        } catch (
                IllegalArgumentException e) {
            System.out.println("Dia inválido");
        }

        sc.close();
    }

    enum DiaDaSemana {
        DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO;
    }

    public static void verOdia(DiaDaSemana d) {
        switch (d) {
            case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA:
                System.out.println("Dia útil");
                break;
            case SABADO, DOMINGO:
                System.out.println("Final de semana");
                break;
        }
    }

}
