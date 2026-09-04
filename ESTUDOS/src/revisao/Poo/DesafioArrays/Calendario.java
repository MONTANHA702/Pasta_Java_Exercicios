package revisao.Poo.DesafioArrays;

import java.util.Scanner;

public class Calendario {

    static final String[] NOME_MESES = {"janeiro", "fevereiro", "março",
            "abril", "maio", "junho", "julho", "agosto",
            "setembro", "outubro", "novembro", "dezembro"};

    static String obterNomeMes(int numeroMes) {

        if (numeroMes < 1 || numeroMes > 12) {
            return "Não existe esse mês.";
        }
        return NOME_MESES[numeroMes - 1];

       /* return switch (numeroMes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> null;
        };*/
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o número do mês (1 a 12): ");
        int mes = sc.nextInt();
        System.out.printf("O mês %d é... %S.%n",mes, Calendario.obterNomeMes(mes));
    }
}
