package revisao.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class desafio {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Preço do produto em dólares:");
        String precoProdutoDigitado = sc.nextLine();

        System.out.println("Valor do dolar em reais: ");
        String precoDolarDigitado = sc.nextLine();

        DecimalFormat formatadorUs = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.US));
        formatadorUs.setParseBigDecimal(true);

        DecimalFormat formatadorBrSemMoeda = new DecimalFormat("#,##0.00",
                new DecimalFormatSymbols(new Locale("pt", "BR")));
        formatadorBrSemMoeda.setParseBigDecimal(true);

        NumberFormat formatadorBrComMoeda = new DecimalFormat("¤ #,##0.00",
                new DecimalFormatSymbols(new Locale("pt", "BR")));

        BigDecimal precoProdutoEmDolares = (BigDecimal) formatadorUs.parse(precoProdutoDigitado);
        System.out.println(precoProdutoEmDolares);
        BigDecimal precoDolar = (BigDecimal) formatadorBrSemMoeda.parse(precoDolarDigitado);
        System.out.println(precoDolar);

        BigDecimal precoProdutoEmReais = precoProdutoEmDolares.multiply(precoDolar);

        System.out.printf("Preço do produto em Reais: %s%n",
                formatadorBrComMoeda.format(precoProdutoEmReais));




    }
}
