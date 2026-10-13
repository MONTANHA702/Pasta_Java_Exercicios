package revisao.numeros.ex05stringemdecimalformat;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        String texto = "1.000,43";

        DecimalFormat formatador = new DecimalFormat("#,##0.00");
        formatador.setParseBigDecimal(true);

        BigDecimal valor = (BigDecimal) formatador.parse(texto);//padrao é number por isso o casting
        BigDecimal total = valor.add(new BigDecimal("1000"));

        System.out.println(total);
    }
}
