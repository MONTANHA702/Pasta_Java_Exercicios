import java.text.NumberFormat;
import java.util.Locale;

public class ClasseLocale {
    public static void main(String[] args) {



        //verificar qual locale está a máquina
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println("===");
        //verificar quais países estão disponíveis
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale loc : locales) {
            System.out.println("Língua: " + loc.getDisplayName());
            System.out.println("Código da Língua: " + loc.getLanguage());
        }
        System.out.println("===");
        //usando NumberFormat
        NumberFormat nf = NumberFormat.getCurrencyInstance();//sem parametro utiliza o modo do idioma do computador
        System.out.println(nf.format(50000000));//Brasil
        System.out.println("===");

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf2.format(50000000));
        System.out.println("===");

        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(nf3.format(50000000));
        System.out.println("===");

        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(nf4.format(50000000));
        System.out.println("===");


    }
}
