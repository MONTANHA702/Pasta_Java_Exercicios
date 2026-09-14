package revisao.poo.ex23heranca.modelando;

public class Main {
    public static void main(String[] args) {

        Titular titular1 = new Titular("Joaozinho", "1234567890");

        Conta conta1 = new Conta();
        conta1.setTitular(titular1);
        conta1.setAgencia(1234);
        conta1.setNumero(432156);
        conta1.setTipoConta(Conta.ESPECIAL);
        conta1.setLimiteChequeEspecial(1000);
        conta1.setTarifaMensal(60);
        conta1.depositar(100);


        conta1.sacar(100);
        conta1.imprimirDemonstrativo();

        conta1.debitarTarifaMensal();
        conta1.imprimirDemonstrativo();





    }
}
