package exercicios.matriz;

import java.util.Locale;
import java.util.Scanner;

public class Ex08ForEachMatriz {
    public static void main(String[] args) {
        //Relatório de vendas trimestral

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas filiais há para lançamento? ");
        int filiais = sc.nextInt();
        while (filiais <=0){
            System.out.println("Digite pelo menos 1 filial.");
            filiais = sc.nextInt();
        }

        //Matriz
        double[][] vendas = new  double[filiais][3];

        for (int i = 0; i < vendas.length; i++){
            for (int j = 0; j < vendas[i].length; j++){
                System.out.printf("VALOR da %da. FILIAL no %do. MÊS: R$ ", (i+1), (j+1));
                vendas[i][j] = sc.nextDouble();
            }
        }
        String separador = "=".repeat(45);
        System.out.println(separador);
        System.out.println("===== LANÇAMENTO TRIMESTRAL POR FILIAL ======");
        for (int i = 0; i < vendas.length; i++){
            for (int j = 0; j < vendas[i].length; j++){
                System.out.printf("%12.2f", vendas[i][j]);
            }
            System.out.println();
        }
        System.out.println(separador);
        System.out.println("===== FATURAMENTO TOTAL DO TRIMESTRE ======");
        double soma = 0;
        for (double[] filial : vendas){
            for (double valor : filial){
                soma += valor;
            }
        }
        System.out.printf("R$ %.2f%n", soma);

        System.out.println(separador);
        System.out.println("===== MAIOR VENDA REGISTRADA NO TRIMESTRE ======");

       /* for (double[] filial : vendas){
            for (double valor : filial){
                if (valor > maiorVenda){
                    maiorVenda = valor;
                }
            }
        }*/
        double maiorVenda = vendas[0][0]; //Indica o primeiro valor lançado indiferente de prejuízo
        //fixando o primeiro valor, fixa-se também a filial [0] e o mes [0]
        int filialMaior = 0;
        int mes = 0;
        for (int i = 0; i < vendas.length; i++){
            for (int j = 0; j < vendas[i].length; j++){
                if (vendas[i][j] > maiorVenda){
                    maiorVenda = vendas[i][j];
                    filialMaior = i;
                    mes = j;
                }
            }
        }

        System.out.printf("Maior venda: R$ %.2f. FILIAL: <%d> MÊS: <%d>%n", maiorVenda, filialMaior+1, mes+1);

        sc.close();
    }
}
