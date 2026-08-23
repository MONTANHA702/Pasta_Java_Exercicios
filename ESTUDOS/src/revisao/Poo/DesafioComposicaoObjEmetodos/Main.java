package revisao.Poo.DesafioComposicaoObjEmetodos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome do funcionário: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Quantos filhos? ");
        funcionario.qtdFilhos = sc.nextInt();

        ContratoTrabalho contrato = new ContratoTrabalho();

        contrato.funcionario = funcionario;

        System.out.println("Digite o valor da hora trabalhada: ");
        contrato.valorHoraTrab = sc.nextDouble();
        System.out.println("Digite o valor da hora extra trabalhada: ");
        contrato.valorHoraExtra = sc.nextDouble();


        FolhaPagamento folha = new FolhaPagamento();

        System.out.println("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas: ");
        int horaExtra= sc.nextInt();


        Holerite holerite = folha.calcular(horasTrabalhadas, horaExtra, contrato);
        holerite.imprimir();


    }

}
