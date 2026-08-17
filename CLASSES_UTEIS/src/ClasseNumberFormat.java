import java.text.NumberFormat;
import java.util.Locale;


public class ClasseNumberFormat {
    public static void main(String[] args) {

        //MOEDA
        //1.000,00 - Brasil
        //1,000.00 - EUA
        NumberFormat nf = NumberFormat.getCurrencyInstance();//local
        System.out.println( nf.format(1000));

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println( nf2.format(1000));

        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
        System.out.println( nf3.format(1000));
        System.out.println("===");

        //PORCENTAGEM
        NumberFormat porcentagem = NumberFormat.getPercentInstance();
        String p = porcentagem.format(0.98);
        System.out.println(p);
        System.out.println("===");



    }
}
