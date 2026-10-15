package revisao.dateecalendar.ex04calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


//Calendar é antigo, porém não depreciado
//serve para fazer operações com datas de forma mais simples que o Date

public class Main {
    public static void main(String[] args) {

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Calendar calendar = Calendar.getInstance();

        //extrair um date do Calendar
        Date data = calendar.getTime();

        //System.out.println(data);
        //System.out.println(formatador.format(data));

        Calendar calendar2 = new GregorianCalendar(1972, Calendar.FEBRUARY, 9);//mes começa do 0
        //extrair um date do Calendar
        Date data2 = calendar2.getTime();

        System.out.println(data2);
        System.out.println(formatador.format(data2));


    }
}
