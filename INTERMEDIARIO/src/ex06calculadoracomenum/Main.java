package ex06calculadoracomenum;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        while (true) {
            double a = imprimir(sc, "Digite um número: ");
            double b = imprimir(sc, "Digite outro número: ");

            for (Operacao op : Operacao.values()) {
                System.out.println(a + op.toString() + b + " = " + op.executarOperacao(a, b));
            }

            System.out.println("Aperte qualquer tecla para continuar, digite A para sair. ");
            sc.nextLine();
            String op = sc.nextLine().toUpperCase().trim();
            if (op.equals("A")) {
                sc.close();
                break;
            }
        }
    }

    public static double imprimir(Scanner sc, String msg) {
        System.out.println(msg);
        return sc.nextDouble();

    }
}
