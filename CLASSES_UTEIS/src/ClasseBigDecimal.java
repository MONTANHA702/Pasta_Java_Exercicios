import java.math.BigDecimal;
import java.util.Locale;

public class ClasseBigDecimal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double a = 0.03;
        double b = 0.01;
        double c = a - b;
        System.out.println(c);//0.0199999999999997
        //Java não tem precisão para contas com double ou float
        //Também nao tem suporte para números superiores ao que é suportado pelo long dai o BigInterger

        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.01");
        BigDecimal _c = _a.subtract(_b);
        System.out.println(_c);

        BigDecimal bd = new BigDecimal("12345432345678.98789654321");
        BigDecimal bd1 = new BigDecimal("67865432.1234567654");
        System.out.println(bd.subtract(bd1));
        System.out.println(bd.multiply(bd1));
        System.out.println(bd1.compareTo(bd));//retorna -1 se for menor, 0 se for igual ou 1 se for maior

    }
}
