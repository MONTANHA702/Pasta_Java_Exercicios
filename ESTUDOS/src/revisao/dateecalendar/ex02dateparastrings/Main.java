package revisao.dateecalendar.ex02dateparastrings;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //Locale.setDefault(Locale.US);

        Date hoje = new Date();

        DateFormat formatador = DateFormat.getDateInstance();
        DateFormat formatador1 = DateFormat.getDateTimeInstance();
        DateFormat formatador2 = DateFormat.getTimeInstance();

        DateFormat formatador3 = DateFormat.getDateTimeInstance(
                DateFormat.SHORT, DateFormat.SHORT);

        DateFormat formatador4 = DateFormat.getDateTimeInstance(
                DateFormat.MEDIUM, DateFormat.MEDIUM);

        DateFormat formatador5 = DateFormat.getDateTimeInstance(
                DateFormat.LONG, DateFormat.LONG);

        DateFormat formatador6 = DateFormat.getDateTimeInstance(
                DateFormat.FULL, DateFormat.FULL, Locale.US);

        //SimpleDateFormat
        DateFormat formatador7 = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");


        //System.out.println("Hoje: " + formatador.format(hoje));
        //System.out.println("Hoje: " + formatador1.format(hoje));
        //System.out.println(formatador2.format(hoje));
        System.out.println(formatador3.format(hoje));
        System.out.println(formatador4.format(hoje));
        System.out.println(formatador5.format(hoje));
        System.out.println(formatador6.format(hoje));
        System.out.println(formatador7.format(hoje));

    }
}
