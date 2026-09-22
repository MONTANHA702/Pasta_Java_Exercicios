package revisao.poo.ex24polimorfismo;

public class Main3 {
    public static void main(String[] args) {

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("José", "12345678910"),
                1234, 121212);
        conta1.setLimiteChequeEspecial(1000);
        conta1.depositar(1200);



        ContaSalario conta2 = new ContaSalario(new Titular("Pedro", "23456543212"), 3452, 454545, 18_000);

        caixaEletronico.transferir(conta1, conta2, 2000);
        conta1.imprimirDemonstrativo();
        conta2.imprimirDemonstrativo();

        ContaInvestimento conta3 = new ContaInvestimento(new Titular("Simao", "2344322345"),
                5679, 56432);
        conta3.depositar(600);
        conta3.creditarRendimentos(20);



        caixaEletronico.imprimirDemonstrativo(conta1);
        caixaEletronico.imprimirDemonstrativo(conta3);
        caixaEletronico.imprimirDemonstrativo(conta2);

    }
}
