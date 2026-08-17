package exercicios.poo.ex10gettersesetters;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        if (saldo <= 0) {
            this.saldo = 0;
        } else  {
            this.saldo = saldo;
        }
    }

    public ContaBancaria(String titular) {
        this(titular, 0);
    }


    //getters e setters

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Valor depositado com sucesso!");
            System.out.println("Saldo atual: " + this.saldo);
        } else {
            System.out.println("Valor negativo.");
        }
    }

    public void sacar(double valor){
        if (saldo >= valor) {
            if(valor > 0) {
                this.saldo -= valor;
                System.out.println("Valor sacado com sucesso!");
                System.out.println("Valor sacado: R$ " + valor);
                System.out.println("Saldo atual: R$ " + this.saldo);
            } else  {
                System.out.println("Valor negativo.");
            }
        } else{
            System.out.println("Saldo insuficiente.");
        }
    }
     public void exibirDados(){
         System.out.println("=== DADOS ===");
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
     }

}
