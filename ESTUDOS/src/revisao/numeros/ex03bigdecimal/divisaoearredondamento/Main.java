package revisao.numeros.ex03bigdecimal.divisaoearredondamento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal x = new BigDecimal("10.0");
        //BigDecimal y = new BigDecimal("2.0");
        BigDecimal y = new BigDecimal("3.0");

        BigDecimal z = x.divide(y, 4, RoundingMode.UP);
        BigDecimal m = x.divide(y, 4, RoundingMode.CEILING);
        BigDecimal e = x.divide(y, 4, RoundingMode.HALF_DOWN);
        //BigDecimal k = x.divide(y, 10, RoundingMode.UP);
        BigDecimal t = x.divide(y, 4, RoundingMode.DOWN);
        BigDecimal n = x.divide(y, 4, RoundingMode.FLOOR);
        BigDecimal d = x.divide(y, 4, RoundingMode.HALF_UP);
        BigDecimal s = x.divide(y, 4, RoundingMode.HALF_EVEN);//bancos



        System.out.println("RoundingMode.UP   " + z);
        separador();
        System.out.println("RoundingMode.CEILING  " + m);
        separador();
        //System.out.println(k);
        System.out.println("RoundingMode.HALF_DOWN  " + e);
        separador();
        System.out.println("RoundingMode.DOWN  " + t);
        separador();
        System.out.println("RoundingMode.FLOOR  " + n);
        separador();
        System.out.println("RoundingMode.HALF_UP  "  + d);
        separador();
        System.out.println("Muito usado pelos bancos para minimizar erros cumulativos,\n" +
                "ele arredonda p baixo e p cima conforme o caso.");
        System.out.println("RoundingMode.HALF_EVEN  " + s);


    }

    private static void separador() {
        String traco = "-".repeat(15);
        System.out.println(traco);
    }
}
