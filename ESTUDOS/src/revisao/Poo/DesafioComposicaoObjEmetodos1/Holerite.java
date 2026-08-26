package revisao.Poo.DesafioComposicaoObjEmetodos1;

public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtra;
    double valorAdicionalFilhos;

    double calcularValorTotal(){

        return valorTotalHorasNormais + valorTotalHorasExtra + valorAdicionalFilhos;
    }

    void imprimir(){
        System.out.println("============================");
        System.out.println("ESPELHO DE PAGAMENTO");
        System.out.printf("Nome: %S%n", funcionario.nome);
        System.out.println("Quantidade de filhos:" + funcionario.quantidadeFilhos);
        System.out.println("_____________________________");
        System.out.printf("Valor a receber horas trabalhadas: R$ %.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor a receber horas extra: R$ %.2f%n", valorTotalHorasExtra);
        System.out.printf("Adicional filhos: R$ %.2f%n", valorAdicionalFilhos);
        System.out.printf("Valor total a receber: R$ %.2f%n", calcularValorTotal());
        System.out.println("============================");
    }
}
