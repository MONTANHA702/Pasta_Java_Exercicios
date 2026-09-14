package revisao.poo.ex23heranca.heranca3;

public class Main {
    public static void main(String[] args) {

        Titular titular1 = new Titular("Joaozinho", "1234567890");

        Conta conta1 = new Conta();
        conta1.setTitular(titular1);
        conta1.setAgencia(1234);
        conta1.setNumero(432156);
        conta1.depositar(200);
        conta1.sacar(100);
        conta1.imprimirDemonstrativo();

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setTitular(titular1);
        contaEspecial.setAgencia(1234);
        contaEspecial.setNumero(432156);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.setTarifaMensal(60);
        contaEspecial.depositar(200);
        contaEspecial.debitarTarifaMensal();
        contaEspecial.imprimirDemonstrativo();


    }
}
