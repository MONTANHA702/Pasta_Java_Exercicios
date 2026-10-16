package revisao.apidatetime.ex06formatandodatahora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

//para formatar o LocalDateTime usamos o formatador DateTimeFormater
public class Main {
    public static void main(String[] args) {


        LocalDateTime dataHora = LocalDateTime.now();


        DateTimeFormatter formatador = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter formatador2 = DateTimeFormatter.ISO_DATE;
//        DateTimeFormatter formatador3 = DateTimeFormatter.ofLocalizedDateTime(
//                FormatStyle.FULL, FormatStyle.SHORT);

        DateTimeFormatter formatador3 = DateTimeFormatter.ofLocalizedDateTime(
                FormatStyle.FULL, FormatStyle.SHORT).withLocale(Locale.US);

        DateTimeFormatter formatador4 = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");



        System.out.println("Data: " + dataHora);
        System.out.println("Formatado com DateTimeFormatter.ISO_DATE_TIME: " + formatador.format(dataHora));
        System.out.println("Formatado com DateTimeFormatter.ISO_DATE: " + formatador2.format(dataHora));
        System.out.println("Formatado com DateTimeFormatter.ISO_DATE: " + dataHora.format(formatador2));//outra forma
        System.out.println("Formatado com DateTimeFormatter.ofLocalizeDateTime: " + formatador3.format(dataHora));//outra forma
        System.out.println("Formatado com DateTimeFormatter.ofPattern: " + formatador4.format(dataHora));


    }
}
