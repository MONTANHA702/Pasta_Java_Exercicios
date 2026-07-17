package exercicios.poo.ex15juroscompostosformula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do capital: ");
        double capital = sc.nextDouble();
        System.out.println("Digite o valor do taxa: ");
        double taxa = sc.nextDouble()/100;
        System.out.println("Digite o periodo em meses: ");
        int periodo = sc.nextInt();

        for(int i=0;i<=periodo;i++){
            System.out.printf("Valor do capital no %do. mês: %.2f %n",i, JurosCompostosF.montante(capital,taxa, i));
        }

        //outra forma aproveitando o valor anterior

      /*  double valor = capital;
        for(int i = 0; i <= periodo; i++){
            System.out.printf("Mes %d: R$ %.2f%n", i, valor);
            valor = valor*(1 +taxa);
        }*/
    }

}
