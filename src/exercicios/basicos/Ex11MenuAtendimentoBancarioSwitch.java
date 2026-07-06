package exercicios.basicos;

import java.util.Locale;
import java.util.Scanner;

public class Ex11MenuAtendimentoBancarioSwitch {
    public static void main(String[] args) {
        //Usando a logica switch

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double saldo = 1000;
        int opRealizadas = 0;

        boolean funcionamento = true;

        while (funcionamento) {
            System.out.println("==== BANCO JAVA ====" +
                    "\n1 - Consultar saldo" +
                    "\n2 - Depositar" +
                    "\n3 - Sacar" +
                    "\n4 - Sair" +
                    "\n====================");

            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("==== SALDO ====");
                    System.out.printf("Seu saldo atual é de R$ %.2f%n", saldo);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("=OPERAÇÃO DE DEPÓSITO=");
                    System.out.println("Quanto deseja depositar? ");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Operação realizada com sucesso. Seu saldo atual é R$ %.2f%n", saldo);
                        System.out.println();
                        opRealizadas++;
                    } else {
                        System.out.println("Operação inválida. VALOR NEGATIVO.");
                    }
                    break;
                case 3:
                    System.out.println("=OPERAÇÃO DE SAQUE=");
                    System.out.println("Quanto deseja sacar? ");
                    double saque = sc.nextDouble();
                    if (saque > 0) {
                        if (saque > saldo) {
                            System.out.println("Operação não realizada. SALDO INSUFICIENTE.");
                            System.out.println();
                        } else {
                            saldo -= saque;
                            System.out.println("Operação realizada com sucesso.");
                            System.out.printf("SAQUE: %.2f%n", saque);
                            System.out.printf("SALDO ATUAL: %.2f%n", saldo);
                            System.out.println();
                            opRealizadas++;
                        }
                    } else {
                        System.out.println("Operação inválida. VALOR NEGATIVO");
                    }
                    break;
                case 4:
                    System.out.printf("Você realizou %d operações.%n", opRealizadas );
                    System.out.println("Obrigado por usar o Banco Java.");
                    funcionamento = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
                    System.out.println();

            }
        }

    }
}
