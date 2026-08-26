package revisao.Poo.DesafioComposicaoObjEmetodos1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionarioJader =  new Funcionario();
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
        ContratoTrabalho contratoJader = new ContratoTrabalho();


        System.out.println("Digite o nome do funcionário: ");
        funcionarioJader.nome = sc.nextLine().toUpperCase();
        System.out.println("Quantidade de filhos: ");
        funcionarioJader.quantidadeFilhos = sc.nextInt();



        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int horasNormais = sc.nextInt();
        System.out.println("Digite a quantidade de horas extras trabalhadas: ");
        int horasExtra = sc.nextInt();


        System.out.println("Digite o valor das horas normais trabalhadas: ");
        contratoJader.valorHoraNormal = sc.nextDouble();
        System.out.println("Digite o valor das horas extras trabalhadas: ");
        contratoJader.valorHoraExtra = sc.nextDouble();
        contratoJader.funcionario = funcionarioJader;




        Holerite salarioJader = folhaDePagamento.calcularSalario(horasNormais, horasExtra, contratoJader);

//        System.out.println("===============");
//        System.out.printf("O valor do salário é R$ %.2f%n", salarioJader.calcularValorTotal());
//        System.out.println("===============");

        salarioJader.imprimir();


    }
}
