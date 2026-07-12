package exercicios.poo.ex04contacorrente;

import java.util.Scanner;

public class ContaCorrente {
    String nome;
    int conta;
    int agencia;
    double saldo = 0;

    Scanner sc = new Scanner(System.in);

    void cadastrar() {
        System.out.println("Cadastrando conta do Corrente");
        System.out.println("Nome do Correntista: ");
        nome = sc.nextLine().trim().toUpperCase();
        System.out.println("Conta do Correntista: ");
        conta = sc.nextInt();
        System.out.println("Agencia do Correntista: ");
        agencia = sc.nextInt();
        System.out.println("Saldo do Correntista: ");
        saldo = sc.nextDouble();

    }

    void exibirCadastro() {
        System.out.println("=== CADASTRO ===");
        System.out.println(nome);
        System.out.printf("CONTA/AG: %d/%d%n", conta, agencia);
        System.out.println("SALDO: R$" + saldo);
    }

    void depositar() {
        System.out.println("Operação de depósito");
        System.out.println("Quanto deseja depositar? ");
        double depositar = sc.nextDouble();
        if (depositar > 0) {
            saldo += depositar;
            System.out.println("Operação realizada com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Operação não realizada. Deposite um valor válido.");
        }
    }

    void sacar() {
        System.out.println("Operação de saque.");
        System.out.println("Quanto deseja sacar? ");
        double sacar = sc.nextDouble();
        if (saldo >= sacar) {
            if (sacar > 0) {
                saldo -= sacar;
                System.out.printf("Saque de %.2f realizado com sucesso. Saldo atual: R$%.2f", sacar, saldo);
            }
        } else {
            System.out.println("Operação não realizada.");
        }
    }


    void consultarSaldo() {
        System.out.println("Saldo em conta: " + saldo);
    }
}




