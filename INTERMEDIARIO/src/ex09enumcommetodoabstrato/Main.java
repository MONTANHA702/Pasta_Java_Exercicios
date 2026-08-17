package ex09enumcommetodoabstrato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        System.out.println("Digite a forma de pagamento: <DINHEIRO> <PIX> <CARTAO>");
        sc.nextLine();
        String formaPagamento = sc.nextLine().trim().toUpperCase();
        FormaDePagamento fp = FormaDePagamento.valueOf(formaPagamento);

        System.out.println("=========");
        System.out.println("Valor da compra: R$ " + valor);
        System.out.println("Desconto " +"("+ fp +"): R$ "+ fp.calcularDesconto(valor));
        System.out.println("Valor final: R$ "+(valor-fp.calcularDesconto(valor)));
        System.out.println("=========");
    }
}
