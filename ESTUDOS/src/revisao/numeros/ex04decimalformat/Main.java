package revisao.numeros.ex04decimalformat;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //Locale.setDefault(Locale.US);

        double a = 4_142_298.4238;
        float b = 0.3f;
        int c = 1;
        BigDecimal d = new BigDecimal("45.354");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        separador();

        NumberFormat formatador = new DecimalFormat("#.###");//nao preenche
        NumberFormat formatador1 = new DecimalFormat("000.000");//preeche com zeros
        NumberFormat formatador2 = new DecimalFormat("0,000.00");//separa as casas
        NumberFormat formatador3 = new DecimalFormat("#,###.##");//separa as casas
        NumberFormat formatador4 = new DecimalFormat("¤ #,##0.00");//moeda corrente
        //unicode para moeda corrente \u00A4

        //metodos de fábrica
        NumberFormat formatador5 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat formatador6 = NumberFormat.getPercentInstance();



        System.out.println(formatador.format(a));
        System.out.println(formatador.format(b));
        System.out.println(formatador.format(c));
        System.out.println(formatador.format(d));
        separador();
        System.out.println(formatador1.format(a));
        System.out.println(formatador1.format(b));
        System.out.println(formatador1.format(c));
        System.out.println(formatador1.format(d));
        separador();
        System.out.println(formatador2.format(a));
        System.out.println(formatador2.format(b));
        System.out.println(formatador2.format(c));
        System.out.println(formatador2.format(d));
        separador();
        System.out.println(formatador3.format(a));
        System.out.println(formatador3.format(b));
        System.out.println(formatador3.format(c));
        System.out.println(formatador3.format(d));
        separador();
        System.out.println(formatador4.format(a));
        System.out.println(formatador4.format(b));
        System.out.println(formatador4.format(c));
        System.out.println(formatador4.format(d));
        separador();
        System.out.println(formatador5.format(a));
        System.out.println(formatador5.format(b));
        System.out.println(formatador5.format(c));
        System.out.println(formatador5.format(d));
        separador();
        System.out.println(formatador6.format(a));
        System.out.println(formatador6.format(b));
        System.out.println(formatador6.format(c));
        System.out.println(formatador6.format(d));

    }

    private static void separador() {
        System.out.println("---------");

    }
}
