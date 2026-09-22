package revisao.poo.ex24polimorfismo;

public class Main {
    public static void main(String[] args) {

        Titular titular = new Titular("Joaozinho", "12345678910");
        ContaEspecial contaJoaozinho = new ContaEspecial(titular, 1234, 989899);
        contaJoaozinho.setTitular(titular);
        contaJoaozinho.setLimiteChequeEspecial(1000);
        contaJoaozinho.setTarifaMensal(70);
        contaJoaozinho.sacar(700);
        contaJoaozinho.imprimirDemonstrativo();

        //UPCASTING DE CLASSE

        //Conta conta = (Conta) contaJoaozinho;
        Conta conta =  contaJoaozinho;

        //continua uma classe ContaEspecial, mas com o alcance da classe Conta
        contaJoaozinho.setLimiteChequeEspecial(1000);
        //conta.setLimiteChequeEspecial(500);// não compila.

        //verificando as classes conta e contaJoaozinho
        System.out.println(conta.getClass().getName());
        System.out.println(contaJoaozinho.getClass().getName());


    }
}
