package revisao.poo.ex23heranca.semheranca;

public class Main {
    public static void main(String[] args) {

        Titular titular1 = new Titular("Joaozinho", "1234567890");

        Conta conta1 = new Conta();
        conta1.setTitular(titular1);
        conta1.setAgencia(1234);
        conta1.setNumero(432156);

        conta1.depositar(500);
        conta1.sacar(400);

        conta1.imprimirDemonstrativo();





    }
}
