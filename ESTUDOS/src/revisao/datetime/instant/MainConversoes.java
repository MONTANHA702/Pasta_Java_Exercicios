package revisao.datetime.instant;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class MainConversoes {
    public static void main(String[] args) {

        //Instant para Date
        Instant instante = Instant.now();
        System.out.println(instante);
        Date instanteParaData = Date.from(instante);
        System.out.println(instanteParaData);
        //System.out.println(instante.getClass());


        System.out.println("======");

        //Date para Instant
        Date data2 = new Date();
        System.out.println(data2);
        Instant dataParaInstante = data2.toInstant();
        System.out.println(dataParaInstante);

        System.out.println("==========");

        //Calendar para Instant
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        Instant calendarParaInstante = calendar.toInstant();
        System.out.println(calendarParaInstante);
        System.out.println("=========");

    }
}
