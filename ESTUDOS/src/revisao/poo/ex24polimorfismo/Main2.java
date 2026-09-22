package revisao.poo.ex24polimorfismo;

public class Main2 {
    public static void main(String[] args) {

        Titular titular = new Titular("Joaozinho", "12345678910");
        ContaInvestimento contaJoaozinho = new ContaInvestimento(titular, 1234, 989899);


        //UPCASTING DE CLASSE
        ContaSalario salarioJoaozinho = new ContaSalario(titular, 1234, 989899, 12000);


        Conta conta = salarioJoaozinho;
        //conta.setSalario(2300);//nao compila
        salarioJoaozinho.setSalario(3200);

    }
}
