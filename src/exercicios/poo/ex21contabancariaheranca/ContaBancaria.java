package exercicios.poo.ex21contabancariaheranca;

import java.util.Scanner;

public abstract class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
        }
public ContaBancaria() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public  void sacar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto deseja sacar? ");
        double saque = sc.nextDouble();
        if (saque > 0){
            if(saldo >= saque){
                this.saldo -= saque;
                System.out.printf("Saque de <R$ %.2f>. Saldo atual <R$ %.2f>%n", saque, saldo);

            } else{
                String info = "Saldo insuficiente";
                System.out.println(info);

            }
        }else {
                System.out.println("Valor impróprio <0> ou <negativo>.");

        }
    }

    public void depositar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto deseja depositar? ");
        double deposito = sc.nextDouble();
        if (deposito > 0){
            this.saldo += deposito;
            System.out.printf("Depósito de <R$ %.2f>. Saldo atual: <R$ %.2f%n", deposito,  saldo);
        } else {
            System.out.println("Depósito não realizado. Valor <0> ou <negativo>.");
        }
    }


    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
