package revisao.poo.desafioimplementandoheranca;

public record Holerite(String nomeFuncionario, String mesAno, double valorSalario) {

    public void imprimir() {
        System.out.println("============");
        System.out.printf("Holerite de %S%n: ", nomeFuncionario());
        System.out.println("MesAno: " + mesAno());
        System.out.printf("Salário a receber: R$ %.2f", valorSalario());
    }
}
