package exercicios.poo.ex10gettersesetters;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("João", 1200);
        c1.exibirDados();
        c1.depositar(200);
        c1.sacar(350);


        System.out.println("==========");
        ContaBancaria c2 = new ContaBancaria("Ayla", -200);
        c2.exibirDados();
        c2.sacar(100);
    }
}
