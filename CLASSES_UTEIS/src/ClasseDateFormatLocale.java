import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class ClasseDateFormatLocale {
    public static void main(String[] args) {

        Date hoje = new Date();
        System.out.println(hoje);
        System.out.println("===");

        //classe DateFormat
        System.out.println("Padrão: " + Locale.getDefault());
        String hojeFormatado = DateFormat.getInstance().format(hoje);//getInstance coloca completo
        System.out.println(hojeFormatado);
        hojeFormatado = DateFormat.getTimeInstance().format(hoje);//getTimeInstance pega so a hora min seg
        System.out.println(hojeFormatado);
        hojeFormatado = DateFormat.getDateInstance().format(hoje);//getDateInstance pega so a data
        System.out.println(hojeFormatado);
        System.out.println("===");

        //Geralmente usa-se o DateFormat quando se trabalha com Locale
        //usa-se o SimpleDateFormat quando se quer formatar a saída


        Locale.setDefault(Locale.US);//muda para US
        System.out.println("Padrão: " + Locale.getDefault());
        String hojeFormatado2 = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado2);


    }
}
