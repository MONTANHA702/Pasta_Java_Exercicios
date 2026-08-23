package revisao.Poo.DesafioComposicaoObjEmetodos;

public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasTrabalhadas;
    double valorTotalHorasExtras;
    double valorAdicionalFilhos;

    double calcularValorTotal(){
        double valorTotal = valorTotalHorasTrabalhadas + valorTotalHorasExtras + valorAdicionalFilhos;
        return valorTotal;
    }

    void imprimir() {
        System.out.println("===========");
        System.out.println("ESPELHO PAGAMENTO");
        System.out.printf("NOME DO FUNCIONÁRIO: %S%n", funcionario.nome);
        System.out.printf("QTD FILHOS: %d%n", funcionario.qtdFilhos);
        System.out.println("_____________");
        System.out.printf("VALOR TOTAL HORAS TRABALHADAS: R$ %.2f%n", valorTotalHorasTrabalhadas);
        System.out.printf("VALOR TOTAL HORAS EXTRAS: R$ %.2f%n", valorTotalHorasExtras);
        System.out.printf("VALOR ADICIONAL FILHOS: R$ %.2f%n", valorAdicionalFilhos);
        System.out.println("_____________");
        System.out.printf("VALOR A SER PAGO: R$ %.2f%n", calcularValorTotal());
        System.out.println("===========");


    }
}
