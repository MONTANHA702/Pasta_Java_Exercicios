import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ClasseDecimalFormat {
    public static void main(String[] args) {

        //maior precisão e maior controle
        //classe filha da NumberFormat


        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao);
        System.out.println(df.format(123456789.67));

        Locale.setDefault(Locale.US);
        DecimalFormat df2 = new DecimalFormat(padrao);
        System.out.println(df2.format(123456789.67));

        Locale.setDefault(Locale.KOREA);
        DecimalFormat df3 = new DecimalFormat(padrao);
        System.out.println(df3.format(123456789.67));


    }
}
