package revisao.numeros.ex04decimalformat;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatacaoCompacta {
    public static void main(String[] args) {


        BigDecimal a = new BigDecimal("398.22");
        BigDecimal b = new BigDecimal("2469.44");
        BigDecimal c = new BigDecimal("4142298.42");
        BigDecimal d = new BigDecimal("8404142298.0");

        NumberFormat formatador = NumberFormat.getCompactNumberInstance();
        NumberFormat formatador2 = NumberFormat.getCompactNumberInstance(
                new Locale("es", "ES"), NumberFormat.Style.LONG);

        System.out.println(formatador.format(a));
        System.out.println(formatador.format(b));
        System.out.println(formatador.format(c));
        System.out.println(formatador.format(d));
        separador();
        System.out.println(formatador2.format(a));
        System.out.println(formatador2.format(b));
        System.out.println(formatador2.format(c));
        System.out.println(formatador2.format(d));

    }

    public static void separador() {
        System.out.println("--------");
    }


}
